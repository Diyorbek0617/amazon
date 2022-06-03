package com.fam.amazon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.fam.amazon.R
import com.fam.amazon.model.Post

class PostAdapter(var context: Context, var items: ArrayList<Post>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewAdapter(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is PostAdapter.PostViewAdapter) {
            val image_posts = holder.image_posts

            image_posts.setImageResource(item.image_posts)
        }
    }
    class PostViewAdapter(view: View) : RecyclerView.ViewHolder(view) {
        var image_posts: ImageView

        init {
            image_posts = view.findViewById(R.id.image_post)
        }
    }
}