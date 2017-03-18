package xyz.geminiwen.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geminiwen on 2017/3/18.
 */

@Module(subcomponents = {
        ActivityComponent.class
})
public class AppModule {
    Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @javax.inject.Singleton
    Singleton provideSingleton() {
        Singleton s = new Singleton();
        s.name = "Hello Dagger";
        return s;
    }

}
