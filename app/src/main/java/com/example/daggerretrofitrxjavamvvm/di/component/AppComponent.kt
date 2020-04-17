package com.example.daggerretrofitrxjavamvvm.di.component

import com.example.daggerretrofitrxjavamvvm.ApplicationExample
import com.example.daggerretrofitrxjavamvvm.di.module.ActivityBuilder
import com.example.daggerretrofitrxjavamvvm.di.module.AppModule
import com.example.daggerretrofitrxjavamvvm.di.module.FragmentBuilder
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton
@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, ActivityBuilder::class, FragmentBuilder::class])
interface AppComponent {
    fun inject(application:ApplicationExample)

    @Component.Factory
    interface Factory{
        fun create():AppComponent
    }
}