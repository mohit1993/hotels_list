package com.example.hotels.view.adapter

import android.graphics.Paint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hotels.R
import com.example.hotels.model.Item
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.bookmark_image.view.*
import kotlinx.android.synthetic.main.location.view.*
import kotlinx.android.synthetic.main.main_item.view.*
import kotlinx.android.synthetic.main.rating.view.*

class HotelListAdapter(items: MutableList<Item>) :
    RecyclerView.Adapter<HotelListAdapter.ViewHolder>() {

    private var itemList: MutableList<Item> = items

    fun setItemList(list: MutableList<Item>) {
        itemList = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView =
            LayoutInflater.from(parent.context).inflate(R.layout.main_item, parent, false)
        return ViewHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = itemList[position]
        holder.item = item
        Picasso.with(holder.itemView.context).load(item.getAvatarUrl()).into(holder.view.image)
        holder.view.name.text = item.getName()
        holder.view.location.text = item.getLocation()
        holder.view.reviews.text = item.getReviews()
        holder.view.rating.text = item.getRating()
        if (item.getPriceTittle().equals(" ")) {
            holder.view.price.text = item.getPrice()
            holder.view.price.paintFlags =
                (holder.view.price.paintFlags).and((Paint.STRIKE_THRU_TEXT_FLAG).inv())
            holder.view.price_des.visibility = View.GONE
        } else {
            holder.view.price.text = item.getPrice()
            holder.view.price.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
            holder.view.price_des.text = item.getPriceTittle()
            holder.view.price_des.visibility = View.VISIBLE
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var view: View = view
        var item: Item? = null
    }
}