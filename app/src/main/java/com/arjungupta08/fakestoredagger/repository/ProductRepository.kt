package com.arjungupta08.fakestoredagger.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.arjungupta08.fakestoredagger.db.FakerDB
import com.arjungupta08.fakestoredagger.model.Product
import com.arjungupta08.fakestoredagger.retrofit.FakerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerApi: FakerApi, private val fakerDB: FakerDB) {

    private val _products = MutableLiveData<List<Product>>()

    val product : LiveData<List<Product>>
        get() = _products

    suspend fun getProducts() {
        val response = fakerApi.getProducts()
        if (response.isSuccessful && response.body() != null) {
            fakerDB.getDao().insertData(response.body()!!)
            _products.postValue(response.body())
        }
    }
}