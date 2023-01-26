package com.example.dz5_month3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz5_month3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().
        replace(R.id.container_o, FirstFragment()).commit()

    }
}