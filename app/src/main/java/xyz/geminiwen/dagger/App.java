package xyz.geminiwen.dagger;

import android.app.Application;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;
import retrofit2.Retrofit;

/**
 * Created by geminiwen on 2017/3/18.
 */

public class App extends Application {

    @Named("baidu")
    @Inject
    Retrofit baiduRetrofit;

    @Named("google")
    @Inject
    Retrofit googleRetrofit;

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(getAppModule())
                .build();


        appComponent.inject(this);
    }

    public AppModule getAppModule() {
        return new TestAppModule(this);
    }

    public AppComponent component() {
        return this.appComponent;
    }
}
