package com.pansijing.douban.movies;

/**
 * @author: zhuhuanhuan
 * @time: 2017/7/8-上午7:56.
 * @email: zhuhuanhuan@mistong.com
 * @desc:
 */

public class DouBanResponse<T> {
    public int count;
    public int start;
    public int total;
    public T subjects;
    public String title;

    @Override
    public String toString() {
        return "DouBanResponse{"
                + "count="
                + count
                + ", start="
                + start
                + ", total="
                + total
                + ", subjects="
                + subjects
                + ", title='"
                + title
                + '\''
                + '}';
    }
}
