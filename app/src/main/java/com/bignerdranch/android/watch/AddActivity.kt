package com.bignerdranch.android.watch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.watch.api.OMDbApi
import retrofit2.Retrofit
import retrofit2.create

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        val retrofit: Retrofit = Retrofit.Builder().baseUrl("https://www.omdbapi.com/").build()
        val omdbApi: OMDbApi = retrofit.create(OMDbApi::class.java)
    }
}