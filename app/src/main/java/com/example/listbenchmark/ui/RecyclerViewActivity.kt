package com.example.listbenchmark.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.listbenchmark.databinding.ActivityRecyclerViewBinding
import com.example.listbenchmark.fakedata.fakeData
import com.example.listbenchmark.ui.compose.ComposeListAdapter

class RecyclerViewActivity : ComponentActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupList()
    }

    private fun setupList() {
        val adapter = when (intent.getStringExtra(LIST_TYPE)) {
            LIST_TYPE_COMPOSE -> ComposeListAdapter()
            else -> ComposeListAdapter()
        }
        binding.recyclerView.adapter = adapter

        adapter.submitList(fakeData)
    }

    companion object {

        private const val TAG = "RecyclerViewActivity"

        const val LIST_TYPE = "list_type"
        const val LIST_TYPE_VIEW = "list_type_view"
        const val LIST_TYPE_COMPOSE = "list_type_compose"
        const val LIST_TYPE_VIEW_PLUS_COMPOSE = "list_type_view_plus_compose"

    }
}
