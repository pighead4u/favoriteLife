package com.pansijing.douban.movies;

import com.pansijing.common.Test;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author: zhuhuanhuan
 * @time: 2017/7/8-上午7:41.
 * @email: zhuhuanhuan@mistong.com
 * @desc:
 */

public interface DouBanMovies {

  @GET("/v2/movie/top250") Observable<Test> getTop250(@Query("start") int start,
      @Query("count") int count);
}
