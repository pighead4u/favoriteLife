package com.pansijing.douban.movies;

import java.util.List;

/**
 * @author: zhuhuanhuan
 * @time: 2017/7/8-上午7:55.
 * @email: zhuhuanhuan@mistong.com
 * @desc:
 */

public class MovieEntity {
  public Rating rating;
  public List<String> genres;
  public String title;
  public List<Cast> casts;
  public Integer collect_count;
  public String original_title;
  public String subtype;
  public List<Director> directors;
  public String year;
  public Image images;
  public String alt;
  public String id;

  @Override public String toString() {
    return "MovieEntity{"
        + "rating="
        + rating
        + ", genres="
        + genres
        + ", title='"
        + title
        + '\''
        + ", casts="
        + casts
        + ", collect_count="
        + collect_count
        + ", original_title='"
        + original_title
        + '\''
        + ", subtype='"
        + subtype
        + '\''
        + ", directors="
        + directors
        + ", year='"
        + year
        + '\''
        + ", images="
        + images
        + ", alt='"
        + alt
        + '\''
        + ", id='"
        + id
        + '\''
        + '}';
  }

  public class Rating {
    public Integer max;
    public Float average;
    public String stars;
    public Integer min;

    @Override public String toString() {
      return "Rating{"
          + "max="
          + max
          + ", average="
          + average
          + ", stars='"
          + stars
          + '\''
          + ", min="
          + min
          + '}';
    }
  }

  public class Cast {
    public String alt;
    public Avatar avatars;
    public String name;
    public String id;

    @Override public String toString() {
      return "Cast{"
          + "alt='"
          + alt
          + '\''
          + ", avatars="
          + avatars
          + ", name='"
          + name
          + '\''
          + ", id='"
          + id
          + '\''
          + '}';
    }
  }

  public class Avatar {
    public String small;
    public String large;
    public String medium;

    @Override public String toString() {
      return "Avatar{"
          + "small='"
          + small
          + '\''
          + ", large='"
          + large
          + '\''
          + ", medium='"
          + medium
          + '\''
          + '}';
    }
  }

  public class Director {
    public String alt;
    public Avatar avatars;
    public String name;
    public String id;

    @Override public String toString() {
      return "Director{"
          + "alt='"
          + alt
          + '\''
          + ", avatars="
          + avatars
          + ", name='"
          + name
          + '\''
          + ", id='"
          + id
          + '\''
          + '}';
    }
  }

  public class Image {
    public String small;
    public String large;
    public String medium;

    @Override public String toString() {
      return "Image{"
          + "small='"
          + small
          + '\''
          + ", large='"
          + large
          + '\''
          + ", medium='"
          + medium
          + '\''
          + '}';
    }
  }
}
