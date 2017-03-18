package xyz.geminiwen.dagger;

import dagger.Component;

/**
 * Created by geminiwen on 2017/3/18.
 */

@Component(modules = {
        AppModule.class
})
public interface AppComponent {
    void inject(App app);
    void inject(MainActivity activity);
}
