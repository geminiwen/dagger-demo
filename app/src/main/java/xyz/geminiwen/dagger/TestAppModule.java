package xyz.geminiwen.dagger;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by geminiwen on 2017/3/18.
 */

public class TestAppModule extends AppModule {
    public TestAppModule(Context context) {
        super(context);
    }

    @Override
    Retrofit providerBaiduRetrofit(OkHttpClient client) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.client(client);
        builder.baseUrl("http://127.0.0.1/");
        return builder.build();
    }
}
