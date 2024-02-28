package com.leiverin.noteapp.di.component

import android.app.Application
import com.example.app100_photogallery.AppApplication
import com.example.app100_photogallery.di.module.*
import com.leiverin.noteapp.di.module.ActivityBindingModule
import com.leiverin.noteapp.di.module.AppModule
import com.leiverin.noteapp.di.module.DatabaseModule
import com.leiverin.noteapp.di.module.FragmentModule
import com.leiverin.noteapp.di.module.PopupModule
import com.leiverin.noteapp.di.module.ServiceModule
import com.leiverin.noteapp.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelModule::class, AppModule::class,
    AndroidSupportInjectionModule::class, ActivityBindingModule::class,
    FragmentModule::class, DatabaseModule::class, PopupModule::class, ServiceModule::class])
interface AppComponent : AndroidInjector<AppApplication> {

    override fun inject(application: AppApplication)

    @Component.Builder
    interface Builder {


        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}