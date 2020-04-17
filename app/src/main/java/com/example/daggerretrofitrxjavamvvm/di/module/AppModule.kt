package com.example.daggerretrofitrxjavamvvm.di.module

import android.app.Application
import android.content.Context
import com.example.daggerretrofitrxjavamvvm.repo.rds.ApiInterface
import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    @Reusable
    fun provideDataService(retrofit: Retrofit):ApiInterface{
        return retrofit.create(ApiInterface::class.java)
    }


    @Provides
    @Singleton
    fun getOkHttpClient():OkHttpClient{
        return OkHttpClient.Builder().build()
    }

    @Provides
    @Reusable
    fun getRetrofit(okHttpClient: OkHttpClient):Retrofit{
        return Retrofit.Builder().client(okHttpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.themoviedb.org/3/")
            .build()
    }

}