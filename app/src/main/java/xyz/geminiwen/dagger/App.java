package xyz.geminiwen.dagger;

import android.app.Application;

import javax.inject.Inject;

/**
 * Created by geminiwen on 2017/3/18.
 */

public class App extends Application {

    @Inject
    Singleton singleton;

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        appComponent.inject(this);
    }

    public AppComponent component() {
        return this.appComponent;
    }
}
