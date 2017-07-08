package com.pansijing.douban;

import com.google.gson.Gson;
import com.pansijing.common.DouBanRetrofit;
import com.pansijing.common.Test;
import com.pansijing.douban.movies.DouBanMovies;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author: holiday
 * @date: 2017/7/2
 * @email: zhuhuanhuan@qccr.com
 * @desc:
 * @version: 1.0.0
 */
public class Main {

  public static void main(String[] args) {
    for (int i = 0; i < 50; i = i + 10) {
      testDouBanTop250(i, 10);
    }
  }

  public static void testDouBanTop250(int start, int count) {
    DouBanRetrofit.getInstance()
        .create(DouBanMovies.class)
        .getTop250(start, count)
        .subscribeOn(Schedulers.io())
        .subscribe(new Observer<Test>() {
          @Override public void onSubscribe(@NonNull Disposable d) {

            System.out.println("sub");
          }

          @Override public void onNext(@NonNull Test test) {

            System.out.println(new Gson().toJson(test));
          }

          @Override public void onError(@NonNull Throwable e) {

            System.out.println("error");
          }

          @Override public void onComplete() {
            System.out.println("complete");
          }
        });
  }
}
