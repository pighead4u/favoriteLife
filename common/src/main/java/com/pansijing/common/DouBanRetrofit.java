package com.pansijing.common;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author: zhuhuanhuan
 * @time: 2017/7/2-上午11:35.
 * @email: zhuhuanhuan@mistong.com
 * @desc: 用于获取豆瓣的电影和书籍
 */

public final class DouBanRetrofit {

  private Retrofit createRetrofit() {
    Retrofit commonRetrofit =
        new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .baseUrl("http://api.douban.com")
            .build();

    return commonRetrofit;
  }
}
