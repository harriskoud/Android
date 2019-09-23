package com.koud.novibet.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.koud.novibet.R
import com.koud.novibet.data.HeadLine

class CustomAdapter(val headlinesList : ArrayList<HeadLine>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): CustomAdapter.ViewHolder {
        // create a new view
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.text_view, parent, false) as TextView
        return ViewHolder(textView)
    }


    override fun getItemCount(): Int {
        return headlinesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = headlinesList.get(0).betViews.get(position).competitor1Caption
    }


    class ViewHolder(val textView : TextView): RecyclerView.ViewHolder(textView)
}