package com.jmonad.maybe;

public class Maybe {
  public static <T> IMaybe<T> maybe(IMaybe<T> value) {
    return value;
  }

  public static <T> IMaybe<T> maybe(T value) {
    return value == null ? new Nothing<T>() : new Just<T>(value);
  }
}