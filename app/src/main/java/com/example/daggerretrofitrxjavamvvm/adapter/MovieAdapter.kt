package com.example.daggerretrofitrxjavamvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.daggerretrofitrxjavamvvm.R
import com.example.daggerretrofitrxjavamvvm.model.Result
import kotlinx.android.synthetic.main.cardview_layout.view.*
import java.util.ArrayList

class MovieAdapter(private val movieList: ArrayList<Result>?,private val ctx: Context) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {



    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val title = itemView.original_title!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(LayoutInflater.from(ctx).inflate(R.layout.cardview_layout,parent,false))
    }

    override fun getItemCount(): Int {
        return movieList?.size ?: 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = movieList?.get(position)?.title
    }
}