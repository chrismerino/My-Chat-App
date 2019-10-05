package com.example.mychatapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClassMessageViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
    
    val name = itemView.findViewById<TextView>(android.R.id.text1)
    val message = itemView.findViewById<TextView>(android.R.id.text2)

    fun bind (chat: ChatMessage) {
        name.text = chat.name
        message.text = chat.message
    }
}