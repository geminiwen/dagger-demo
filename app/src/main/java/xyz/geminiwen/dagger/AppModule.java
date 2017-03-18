package xyz.geminiwen.dagger;

import android.content.Context;

import javax.inject.*;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
    @javax.inject.Singleton
    OkHttpClient providesOkhttp() {
        OkHttpClient client = new OkHttpClient.Builder().build();
        return client;
    }

    @Named("baidu")
    @Provides
    @javax.inject.Singleton
    Retrofit providerBaiduRetrofit(OkHttpClient client) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("https://api.baidu.com");
        builder.client(client);
        return builder.build();
    }

    @Named("google")
    @Provides
    @javax.inject.Singleton
    Retrofit providerGoogleRetrofit(OkHttpClient client) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("https://api.google.com");
        builder.client(client);
        return builder.build();
    }

}
