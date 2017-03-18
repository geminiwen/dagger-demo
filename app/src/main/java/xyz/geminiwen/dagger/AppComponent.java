package xyz.geminiwen.dagger;

import javax.inject.*;

import dagger.Component;

/**
 * Created by geminiwen on 2017/3/18.
 */

@Component(modules = {
        AppModule.class
})
@javax.inject.Singleton
public interface AppComponent {
    void inject(App app);
    void inject(MainActivity activity);
}
