package com.github.maybe.android.di;

import com.github.maybe.android.di.scopes.ActivityScope;
import com.github.maybe.android.presenter.SomePresenter;
import com.github.maybe.android.presenter.SomePresenterImpl;
import com.github.maybe.android.ui.activity.SomeActivity;
import dagger.Module;
import dagger.Provides;

/**
 * This module will inject the instance of the
 * presenter and interactor of Activity {@link SomeActivity}.
 */
@Module public class SomeModule {

  @Provides @ActivityScope SomePresenter provideSomePresenter(
      SomePresenterImpl getSomePresenter) {
    return getSomePresenter;
  }

}