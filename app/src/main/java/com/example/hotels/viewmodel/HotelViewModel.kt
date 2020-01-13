package com.example.hotels.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.example.hotels.model.Data
import com.example.hotels.model.Item
import com.example.hotels.model.Loader

class HotelViewModel(application: Application) : AndroidViewModel(application) {
    private val loader: Loader = Loader()
    private val item: MutableLiveData<List<Item>> = MutableLiveData<List<Item>>().apply {
        value = loader.getItemsList()
    }

    fun getItem(): LiveData<List<Item>> {
        return item
    }
}