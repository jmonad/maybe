package com.github.maybe.android.presenter;

import android.os.Bundle;
import javax.inject.Inject;

public class SomePresenterImpl implements SomePresenter {

  private View view;

  @Inject public SomePresenterImpl() { }

  @Override public void initialize() {

  }

  @Override public void setView(View view) {
    if (view == null) {
      throw new IllegalArgumentException("The view must not be null!");
    }
    this.view = view;
  }

  @Override public Bundle saveInstance(Bundle instance) {
    return null;
  }

  @Override public void restoreInstance(Bundle instance) {

  }

  @Override public void destroy() {

  }

  private void someCallback() {
    if(view.isReady()) {
      //view.someCallback();
    }
  }

}
