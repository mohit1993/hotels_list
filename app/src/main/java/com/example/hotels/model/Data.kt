package com.example.hotels.model

import com.example.hotels.R

class Data {

    private val avatarUrlList: ArrayList<Int> = ArrayList(5)
    private val nameList: ArrayList<String> = ArrayList(5)
    private val ratingList: ArrayList<String> = ArrayList(5)
    private val reviewsList: ArrayList<String> = ArrayList(5)
    private val locationList: ArrayList<String> = ArrayList(5)
    private val priceList: ArrayList<String> = ArrayList(5)
    private val priceTittleList: ArrayList<String> = ArrayList(5)

    fun getAvatarUrlList(): ArrayList<Int> {
        return avatarUrlList
    }

    fun getNameList(): ArrayList<String> {
        return nameList
    }

    fun getRatingList(): ArrayList<String> {
        return ratingList
    }

    fun getReviewsList(): ArrayList<String> {
        return reviewsList
    }

    fun getLocationList(): ArrayList<String> {
        return locationList
    }

    fun getPriceList(): ArrayList<String> {
        return priceList
    }

    fun getPriceTittleList(): ArrayList<String> {
        return priceTittleList
    }

    fun loadData() {
        //hotels images
        avatarUrlList.add(R.drawable.best_western)
        avatarUrlList.add(R.drawable.country_in)
        avatarUrlList.add(R.drawable.diya)
        avatarUrlList.add(R.drawable.liberty)
        avatarUrlList.add(R.drawable.madikeri)
        avatarUrlList.add(R.drawable.oberoi)
        avatarUrlList.add(R.drawable.radison)
        avatarUrlList.add(R.drawable.taj)
        avatarUrlList.add(R.drawable.venu)
        avatarUrlList.add(R.drawable.villa_de_orange)

        //hotels name
        nameList.add("Best Western")
        nameList.add("Country In")
        nameList.add("Diya")
        nameList.add("Liberty")
        nameList.add("Madikeri")
        nameList.add("Oberoi")
        nameList.add("Radison")
        nameList.add("Taj")
        nameList.add("Venu")
        nameList.add("Villa De Orange")

        //hotels rating
        ratingList.add("4.5")
        ratingList.add("4.1")
        ratingList.add("3.5")
        ratingList.add("4.4")
        ratingList.add("4.1")
        ratingList.add("4.2")
        ratingList.add("4.5")
        ratingList.add("4.7")
        ratingList.add("2.9")
        ratingList.add("3.3")

        //hotels Reviews
        reviewsList.add("12 Reviews")
        reviewsList.add("2 Reviews")
        reviewsList.add("3 Reviews")
        reviewsList.add("4 Reviews")
        reviewsList.add("5 Reviews")
        reviewsList.add("5 Reviews")
        reviewsList.add("3 Reviews")
        reviewsList.add("9 Reviews")
        reviewsList.add("4 Reviews")
        reviewsList.add("5 Reviews")

        //hotels location
        locationList.add("Manesar ,Delhi")
        locationList.add("Himachal")
        locationList.add("Indirapuram ")
        locationList.add("Ghaziabaad")
        locationList.add("Manesar Delhi")
        locationList.add("Akshardham")
        locationList.add("Manesar Delhi")
        locationList.add("Gurgaon")
        locationList.add("Manesar, Delhi")
        locationList.add("Manesar Delhi")


        //hotels price
        priceList.add("₹ 2500")
        priceList.add("₹ 3500")
        priceList.add("₹ 4000")
        priceList.add("₹ 3200")
        priceList.add("₹ 2900")
        priceList.add("₹ Rental Only")
        priceList.add("₹ 3400")
        priceList.add("₹ 3300")
        priceList.add("₹ Rental Only")
        priceList.add("₹ 2200")

        //hotels price description
        priceTittleList.add(" ")
        priceTittleList.add("per plate")
        priceTittleList.add(" ")
        priceTittleList.add(" ")
        priceTittleList.add(" ")
        priceTittleList.add(" ")
        priceTittleList.add(" ")
        priceTittleList.add("per plate")
        priceTittleList.add(" ")
        priceTittleList.add(" ")
    }

}