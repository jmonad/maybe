package com.github.maybe.android.presenter;

public interface SomePresenter extends Presenter {
  void initialize();
  void setView(View view);
  interface View {
    boolean isReady();
    void someCallback(String result);
  }
}
