package com.koud.novibet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.koud.novibet.api.ApiRepository
import com.koud.novibet.data.HeadLine
import com.koud.novibet.ui.ApiViewModel
import com.koud.novibet.ui.ApiViewModelFactory
import com.koud.novibet.ui.CustomAdapter


class MainActivity : AppCompatActivity() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var myDataset = ArrayList<HeadLine>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeUi()

        viewManager = LinearLayoutManager(this)
        viewAdapter = CustomAdapter(myDataset)

        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter

        }

    }

    private fun initializeUi() {

        val apiRepository = ApiRepository()
        val factory = ApiViewModelFactory(apiRepository);
        val viewModel = ViewModelProviders.of(this, factory).get(ApiViewModel::class.java)

        viewModel.getHeadLines().observe(this, Observer { betViews ->
            betViews.forEach { betView -> myDataset.add(betView) }
        })





    }


}

