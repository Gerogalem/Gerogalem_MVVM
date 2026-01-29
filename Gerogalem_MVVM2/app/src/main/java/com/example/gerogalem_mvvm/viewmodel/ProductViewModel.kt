package com.example.gerogalem_mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gerogalem_mvvm.model.Product

class ProductViewModel : ViewModel() {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> = _products

    init {
        loadProducts()
    }

    private fun loadProducts() {
        _products.value = listOf(
            Product(1, "Laptop", 1200.0),
            Product(2, "Phone", 800.0),
            Product(3, "Headphones", 150.0)
        )
    }
}
