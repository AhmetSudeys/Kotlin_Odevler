package com.ahmetsudeys.odev6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SongAdapter(private val songList: List<Song>) :
    RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    class SongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageCover: ImageView = itemView.findViewById(R.id.imageCover)
        val textTitle: TextView = itemView.findViewById(R.id.textTitle)
        val textArtist: TextView = itemView.findViewById(R.id.textArtist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_song, parent, false)
        return SongViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songList[position]
        holder.textTitle.text = song.title
        holder.textArtist.text = song.artist
        holder.imageCover.setImageResource(song.imageResId)
    }

    override fun getItemCount(): Int = songList.size
}
