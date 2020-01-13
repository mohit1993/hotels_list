package com.example.hotels.model

class Item(
    avatarUrl: Int, name: String, rating: String, reviews: String, location: String,
    price: String, priceTittle: String
) {

    private val avatarUrl: Int = avatarUrl
    private val name: String = name
    private val rating: String = rating
    private val reviews: String = reviews
    private val location: String = location
    private val price: String = price
    private val priceTittle: String = priceTittle

    fun getAvatarUrl(): Int {
        return avatarUrl
    }

    fun getName(): String {
        return name
    }

    fun getRating(): String {
        return rating
    }

    fun getReviews(): String {
        return reviews
    }

    fun getLocation(): String {
        return location
    }

    fun getPrice(): String {
        return price
    }

    fun getPriceTittle(): String {
        return priceTittle
    }
}