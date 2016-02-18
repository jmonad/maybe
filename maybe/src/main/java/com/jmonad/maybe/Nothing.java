package com.jmonad.maybe;

import com.jmonad.maybe.lambda.Function;

public class Nothing<A> implements IMaybe<A> {
  @Override
  public IMaybe bind(Function fn) {
    return this;
  }

  @Override
  public A fromJust() {
    throw new RuntimeException("Cannot call fromJust() on Nothing");
  }

  @Override
  public A fromMaybe(A def) {
    return def;
  }

  @Override
  public boolean isJust() {
    return false;
  }

  @Override
  public boolean isNothing() {
    return true;
  }

  @Override
  public <B> B maybe(B def, Function<B, A> fn) {
    return def;
  }
}