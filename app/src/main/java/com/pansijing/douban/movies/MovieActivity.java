package com.pansijing.douban.movies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pansijing.common.DouBanRetrofit;
import com.pansijing.douban.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MovieActivity extends AppCompatActivity {

    private static final String TAG = "MovieActivity";

    @BindView(R.id.movie_contents)
    RecyclerView movieContents;

    MovieAdapter movieAdapter;

    List<MovieEntity> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        ButterKnife.bind(this);

        initView();
        initData();
    }

    private void initView() {
        movieContents.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        testDouBan();
    }

    private void testDouBan() {
        DouBanRetrofit.getInstance()
                .create(DouBanMovies.class)
                .getTop250(0, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DouBanResponse<List<MovieEntity>>>() {
                    @Override
                    public void accept(@NonNull DouBanResponse<List<MovieEntity>> listDouBanResponse)
                            throws Exception {
                        if (listDouBanResponse != null && listDouBanResponse.subjects != null) {
                            datas.addAll(listDouBanResponse.subjects);
                            movieAdapter = new MovieAdapter(datas);
                        }
                    }
                });
    }
}
