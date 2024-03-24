package com.arjungupta08.fakestoredagger.di

import android.content.Context
import androidx.room.Room
import com.arjungupta08.fakestoredagger.db.FakerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun getDatabase(context: Context) : FakerDB {
        return Room.databaseBuilder(context, FakerDB::class.java, "FakerDB").build()
    }
}