package com.github.maybe.android.di.components;

import android.app.Activity;
import com.github.maybe.android.di.ActivityModule;
import com.github.maybe.android.di.SomeModule;
import com.github.maybe.android.di.scopes.ActivityScope;
import com.github.maybe.android.presenter.SomePresenter;
import com.github.maybe.android.ui.activity.SomeActivity;
import dagger.Component;

/**
 * This is the component to be used on the main
 * activity of the application, This expose the
 * presenter and interactor. This expose another
 * instance for these classes, like the threads
 * and OkHttp instance.
 *
 *  * Scope {@link ActivityScope} will limit the
 *  injection to the activity scope.
 *
 */
@SuppressWarnings("unused")
@ActivityScope @Component(dependencies = ApplicationComponent.class,
    modules = { ActivityModule.class, SomeModule.class })
public interface SomeComponent {
  void inject(SomeActivity someActivity);
  Activity activityContext();
  SomePresenter somePresenter();
}