package xyz.geminiwen.dagger;

import android.app.Application;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;

/**
 * Created by geminiwen on 2017/3/18.
 */

public class App extends Application {

    @Inject
    Lazy<Singleton> singletonProvider;
    @Inject
    Provider<Singleton2> singleton2Provider;

    @Inject
    Lazy<Singleton2> singleton2LazyProvider;

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        appComponent.inject(this);

        
        Object o;
        o = singleton2Provider.get();
        o = singleton2Provider.get();
        o = singleton2Provider.get();
        o = singleton2Provider.get();

        o = singleton2LazyProvider.get();
        o = singleton2LazyProvider.get();
        o = singleton2LazyProvider.get();

    }

    public AppComponent component() {
        return this.appComponent;
    }
}
