package com.example.daggerretrofitrxjavamvvm.di.module

import com.example.daggerretrofitrxjavamvvm.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract fun providesMainActivity():MainActivity
}