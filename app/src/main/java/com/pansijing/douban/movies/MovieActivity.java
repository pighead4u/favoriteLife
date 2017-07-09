package com.pansijing.douban.movies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.pansijing.common.DouBanRetrofit;
import com.pansijing.douban.R;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

public class MovieActivity extends AppCompatActivity {

  private static final String TAG = "MovieActivity";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie);

    testDouBan();
  }

  private void testDouBan() {
    DouBanRetrofit.getInstance()
        .create(DouBanMovies.class)
        .getTop250(0, 10)
        .subscribeOn(Schedulers.io())
        .subscribe(new Consumer<DouBanResponse<List<MovieEntity>>>() {
          @Override
          public void accept(@NonNull DouBanResponse<List<MovieEntity>> listDouBanResponse)
              throws Exception {
            Log.e(TAG, "accept: ");
          }
        });
  }
}
