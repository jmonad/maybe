package com.jmonad.maybe;

import org.junit.Test;

import static com.jmonad.maybe.Maybe.maybe;

public class MaybeTest {

  @Test public void testSample() {
      assert maybe("sample").fromMaybe("").equals("sample");
  }

}
