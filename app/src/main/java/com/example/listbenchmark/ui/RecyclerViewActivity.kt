package com.example.listbenchmark.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.example.listbenchmark.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : ComponentActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupList()
    }

    private fun setupList() {
        Log.d(TAG, "setupList: ${intent.getStringExtra(LIST_TYPE)}")
        binding.recyclerView.adapter = when (intent.getStringExtra(LIST_TYPE)) {
            else -> null
        }
    }

    companion object {

        private const val TAG = "RecyclerViewActivity"

        const val LIST_TYPE = "list_type"
        const val LIST_TYPE_VIEW = "list_type_view"
        const val LIST_TYPE_COMPOSE = "list_type_compose"
        const val LIST_TYPE_VIEW_PLUS_COMPOSE = "list_type_view_plus_compose"

    }
}
