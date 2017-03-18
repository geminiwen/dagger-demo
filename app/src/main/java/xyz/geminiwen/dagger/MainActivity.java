package xyz.geminiwen.dagger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

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

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
