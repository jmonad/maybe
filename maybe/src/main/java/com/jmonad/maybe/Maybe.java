package com.jmonad.maybe;

public final class Maybe {
  public static <T> IMaybe maybe(T value) {
    if (value instanceof IMaybe) {
      return (IMaybe) value;
    }

    return value == null ? new Nothing() : new Just<T>(value);
  }
}