package com.bignerdranch.android.watch.AddActivityPack

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.watch.R
import com.bignerdranch.android.watch.databinding.AddFilmItemBinding

class AddFilmAdapter: RecyclerView.Adapter<AddFilmAdapter.AddFilmHolder>() {
    val addFilmList = ArrayList<AddFilm>()
    class AddFilmHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = AddFilmItemBinding.bind(item)
        fun bind(addFilm: AddFilm) = with(binding){
            imageView.setImageResource(addFilm.imageFilm)
            titleTextView.text = addFilm.titleFilm
            yearTextView.text = addFilm.yearReleaseFilm
            genreTextView.text = addFilm.genre
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddFilmHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.add_film_item, parent, false)
        return AddFilmHolder(view)
    }
    override fun onBindViewHolder(holder: AddFilmHolder, position: Int) {
        holder.bind(addFilmList[position])
    }
    override fun getItemCount(): Int {
        return addFilmList.size
    }
    fun addFilm(addFilm: AddFilm){
        addFilmList.add(addFilm)
        notifyDataSetChanged()
    }
}