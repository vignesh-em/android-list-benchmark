package com.example.listbenchmark.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.listbenchmark.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : ComponentActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
