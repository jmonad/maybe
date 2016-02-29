package com.github.maybe.android;

import android.app.Application;
import com.github.maybe.android.di.ApplicationModule;
import com.github.maybe.android.di.components.ApplicationComponent;
import com.github.maybe.android.di.components.DaggerApplicationComponent;

public class MaybeApplication extends Application {

  private ApplicationComponent applicationComponent;

  public MaybeApplication() {
    super();
  }

  @Override public void onCreate() {
    super.onCreate();
    initializeDependencyInjector().inject(this);
  }

  /**
   * This methid will generate the component tha will inject
   * the Thread and the Pool of Threads.
   * @return Component generate and loaded with his module.
   */
  private ApplicationComponent initializeDependencyInjector() {
    if (applicationComponent == null) {
      applicationComponent = DaggerApplicationComponent.builder()
          .applicationModule(new ApplicationModule(this))
          .build();
    }
    return applicationComponent;
  }

  /**
   * Expose the component for Activities and Fragments.
   * @return The main component of the app.
   */
  public ApplicationComponent component() {
    return applicationComponent;
  }

}
