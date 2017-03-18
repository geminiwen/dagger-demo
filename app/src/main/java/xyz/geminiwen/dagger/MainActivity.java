package xyz.geminiwen.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Singleton singleton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((App)this.getApplication()).component()
                .inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
