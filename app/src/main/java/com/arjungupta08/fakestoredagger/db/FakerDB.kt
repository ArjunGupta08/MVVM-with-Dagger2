package com.arjungupta08.fakestoredagger.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.arjungupta08.fakestoredagger.model.Product

@Database(entities = [Product::class], version = 1)
abstract class FakerDB : RoomDatabase() {
    abstract fun getDao() : FakerDao
}