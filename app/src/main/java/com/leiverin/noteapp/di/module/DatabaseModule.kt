package com.leiverin.noteapp.di.module

import android.app.Application
import androidx.room.Room
import com.leiverin.noteapp.db.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    internal fun provideAppDataBaseModule(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "NoteApp.db")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }

}
