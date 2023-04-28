package com.example.retrofitproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.retrofitproject.databinding.ContentBasicBinding

class BasicActivity : AppCompatActivity() {

    private lateinit var binding: ContentBasicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        //WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ContentBasicBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}