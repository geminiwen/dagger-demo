package xyz.geminiwen.dagger;

import dagger.Subcomponent;

/**
 * Created by geminiwen on 2017/3/18.
 */

@Subcomponent(modules = {
        ActivityModule.class
})
@ActivityScope
public interface ActivityComponent {
    void inject(MainActivity activity);
    void inject(SecondActivity activity);

    @Subcomponent.Builder
    interface Builder {
        Builder module(ActivityModule module);
        ActivityComponent build();
    }
}
