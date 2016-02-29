package com.github.maybe.android.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.github.maybe.android.MaybeApplication;
import com.github.maybe.android.R;
import com.github.maybe.android.di.ActivityModule;
import com.github.maybe.android.di.SomeModule;
import com.github.maybe.android.di.components.DaggerSomeComponent;
import com.github.maybe.android.di.components.SomeComponent;
import com.github.maybe.android.presenter.SomePresenter;

import static com.jmonad.maybe.Maybe.maybe;

public class SomeActivity extends AppCompatActivity implements SomePresenter.View {

  private SomeComponent someComponent;

  @Bind(R.id.toolbar) Toolbar toolbar;
  @Bind(R.id.recycler_view) RecyclerView recyclerView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    someComponent().inject(this);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    configToolbar();
  }

  @Override public boolean isReady() {
    return !isFinishing();
  }

  @Override public void someCallback(String result) {
    //TODO: Finish the case of use of maybe implementation.
  }

  private void configToolbar() {
    setSupportActionBar(toolbar);
    maybe(getSupportActionBar()).bind(actionBar -> {
      actionBar.setHomeButtonEnabled(true);
      actionBar.setDisplayShowHomeEnabled(true);
      return actionBar;
    });
  }

  /**
   * Generate the base component of this view.
   * This uses the application component to
   * provide the thread(main and thread pool),
   * OkHttp and the presenter of this view.
   * @return Instance of the component, generated.
   */
  private SomeComponent someComponent() {
    if(someComponent == null) {
      someComponent = DaggerSomeComponent.builder()
          .applicationComponent(((MaybeApplication) getApplication()).component())
          .activityModule(new ActivityModule(this))
          .someModule(new SomeModule())
          .build();
    }
    return someComponent;
  }

}
