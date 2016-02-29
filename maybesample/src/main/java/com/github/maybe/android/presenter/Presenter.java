package com.github.maybe.android.presenter;

import android.os.Bundle;

/**
 * Generic use of the presenter
 */
public interface Presenter {
  Bundle saveInstance(Bundle instance);
  void restoreInstance(Bundle instance);
  void destroy();
}