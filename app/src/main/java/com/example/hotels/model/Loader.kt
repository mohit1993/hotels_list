package com.example.hotels.model

class Loader {

    private val data: Data = Data()
    private val itemsList = ArrayList<Item>()

    fun getItemsList(): ArrayList<Item> {
        data.loadData()
        loadItem()
        return itemsList
    }

    private fun loadItem() {
        for (i: Int in 0..9) {
            itemsList.add(
                Item(
                    data.getAvatarUrlList()[i],
                    data.getNameList()[i],
                    data.getRatingList()[i],
                    data.getReviewsList()[i],
                    data.getLocationList()[i],
                    data.getPriceList()[i],
                    data.getPriceTittleList()[i]
                )
            )
        }
    }
}