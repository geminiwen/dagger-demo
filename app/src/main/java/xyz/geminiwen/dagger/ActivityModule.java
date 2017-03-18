package xyz.geminiwen.dagger;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geminiwen on 2017/3/18.
 */

@Module
public class ActivityModule {
    Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    SingletonPerActivity provideSingleton2() {
        SingletonPerActivity s = new SingletonPerActivity();
        s.name = "Hello SinglePerActivity";
        return s;
    }
}
