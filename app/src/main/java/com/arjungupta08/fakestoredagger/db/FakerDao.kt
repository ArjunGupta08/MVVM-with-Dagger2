package com.arjungupta08.fakestoredagger.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.arjungupta08.fakestoredagger.model.Product

@Dao
interface FakerDao {

    @Insert
    suspend fun insertData(product: List<Product>)

    @Query("SELECT * FROM Product")
    suspend fun getData() : List<Product>

}