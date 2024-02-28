package com.bignerdranch.android.watch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bignerdranch.android.watch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = FilmAdapter()
    private val imageIdList = listOf(R.drawable.harrypotter1,
        R.drawable.harrypotter2,
        R.drawable.harrypotter3,
        R.drawable.harrypotter4,
        R.drawable.harrypotter5)
    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@MainActivity)
            rcView.adapter = adapter
            addButton.setOnClickListener{
                if(index > 4) index = 0
                val film = Film(imageIdList[index], "GP $index", "$index")
                adapter.addFilm(film)
                index++
            }
        }
    }
}