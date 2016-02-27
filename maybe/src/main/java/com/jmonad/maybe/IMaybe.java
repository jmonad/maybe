package com.jmonad.maybe;

import com.jmonad.maybe.lambda.Function;

public interface IMaybe<A> {
  <B> IMaybe<B> bind(Function<B, A> fn);
  A fromJust();
  A fromMaybe(A def);
  boolean isJust();
  boolean isNothing();
  <B> B maybe(B def, Function<B, A> fn);
}