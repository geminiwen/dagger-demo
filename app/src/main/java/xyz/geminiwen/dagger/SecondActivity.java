package xyz.geminiwen.dagger;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject
    Singleton singleton;

    @Inject
    SingletonPerActivity activitySingleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((App)this.getApplication()).component()
                .provideBuilder()
                .module(new ActivityModule(this))
                .build()
                .inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
