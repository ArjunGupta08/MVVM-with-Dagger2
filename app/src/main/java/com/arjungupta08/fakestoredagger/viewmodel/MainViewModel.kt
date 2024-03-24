package com.arjungupta08.fakestoredagger.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arjungupta08.fakestoredagger.model.Product
import com.arjungupta08.fakestoredagger.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: ProductRepository) : ViewModel() {

    val products : LiveData<List<Product>>
        get() = repository.product

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }

}