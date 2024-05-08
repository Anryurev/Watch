package com.bignerdranch.android.watch.AddActivityPack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.watch.R
import com.bignerdranch.android.watch.api.OMDbApi
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
    }
}