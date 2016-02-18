package com.jmonad.maybe.lambda;

public interface Function<Ret, Arg> {
  Ret call(Arg arg);
}
