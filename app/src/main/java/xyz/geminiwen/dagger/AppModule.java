package xyz.geminiwen.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geminiwen on 2017/3/18.
 */

@Module
public class AppModule {
    Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    Singleton provideSingleton() {
        Singleton s = new Singleton();
        s.name = "Hello Dagger";
        return s;
    }
}
