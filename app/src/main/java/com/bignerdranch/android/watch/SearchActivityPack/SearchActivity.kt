package com.bignerdranch.android.watch.SearchActivityPack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.watch.R
import com.bignerdranch.android.watch.api.OMDbApi
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

private const val TAG = "SearchActivity"

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        val retrofit: Retrofit = Retrofit.Builder().baseUrl("https://www.omdbapi.com/")
            .addConverterFactory(ScalarsConverterFactory.create()).build()
        val omdbApi: OMDbApi = retrofit.create(OMDbApi::class.java)

    }
}