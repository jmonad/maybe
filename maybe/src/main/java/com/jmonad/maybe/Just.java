package com.jmonad.maybe;

import com.jmonad.maybe.lambda.Function;

public class Just<A> implements IMaybe<A> {
  private A value;

  public Just(A value) {
    this.value = value;
  }

  @Override
  public <B> IMaybe bind(Function<B, A> fn) {
    return Maybe.maybe(fn.call(this.value));
  }

  @Override
  public A fromJust() {
    return this.value;
  }

  @Override
  public A fromMaybe(A def) {
    return this.value;
  }

  @Override
  public boolean isJust() {
    return true;
  }

  @Override
  public boolean isNothing() {
    return false;
  }

  @Override
  public <B> B maybe(B def, Function<B, A> fn) {
    return fn.call(null);
  }
}
