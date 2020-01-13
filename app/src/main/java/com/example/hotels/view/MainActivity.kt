package com.example.hotels.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.example.hotels.R
import com.example.hotels.view.adapter.HotelListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.hotels.model.Item
import com.example.hotels.viewmodel.HotelViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var mAdapter: HotelListAdapter
    private val mLayoutManager = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = mLayoutManager

        val model = ViewModelProviders.of(this)[HotelViewModel::class.java]
        mAdapter = HotelListAdapter(model.getItem().value as MutableList<Item>)
        recyclerView.adapter = mAdapter

        model.getItem().observe(this, Observer<List<Item>> { items ->
            mAdapter.setItemList(items as MutableList<Item>)
            mAdapter.notifyDataSetChanged()
        })

        //restore previous configuration position
        if (savedInstanceState != null)
            recyclerView.scrollToPosition(savedInstanceState.getInt("Position"))
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt("Position", mLayoutManager.findFirstVisibleItemPosition())
    }
}
