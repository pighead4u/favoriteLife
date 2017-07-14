package com.pansijing.douban.movies;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pansijing.douban.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author: zhuhuanhuan
 * @time: 2017/7/15-上午7:12.
 * @email: zhuhuanhuan@mistong.com
 * @desc:
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieItemViewHolder> {

    List<MovieEntity> datas;


    public MovieAdapter(List<MovieEntity> movies) {
        datas = movies;
    }

    @Override
    public MovieItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MovieItemViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movie, parent, false));
    }

    @Override
    public void onBindViewHolder(MovieItemViewHolder holder, int position) {
        if (datas != null) {

        }
    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }

    public static class MovieItemViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.movie_item_pic)
        com.facebook.drawee.view.SimpleDraweeView movieItemPic;
        @BindView(R.id.movie_item_name)
        TextView movieItemName;
        @BindView(R.id.movie_item_year)
        TextView movieItemYear;
        @BindView(R.id.movie_item_type1)
        TextView movieItemType1;
        @BindView(R.id.movie_item_type2)
        TextView movieItemType2;
        @BindView(R.id.movie_item_type3)
        TextView movieItemType3;
        @BindView(R.id.movie_item_rate)
        TextView movieItemRate;
        @BindView(R.id.movie_item_directors)
        TextView movieItemStar;

        MovieItemViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
