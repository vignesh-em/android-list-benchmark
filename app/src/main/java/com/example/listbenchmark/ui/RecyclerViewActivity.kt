package com.example.listbenchmark.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.listbenchmark.databinding.ActivityRecyclerViewBinding
import com.example.listbenchmark.fakedata.fakeData

class RecyclerViewActivity : ComponentActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupList()
    }

    private fun setupList() {
        PlantListAdapter(getAdapterType(intent.getStringExtra(LIST_TYPE))).run {
            binding.recyclerView.adapter = this
            submitList(fakeData)
        }
    }

    private fun getAdapterType(listType: String?) = when (listType) {
        LIST_TYPE_VIEW -> AdapterType.View
        LIST_TYPE_COMPOSE -> AdapterType.Compose
        else -> AdapterType.ViewPlusCompose
    }

    companion object {

        private const val TAG = "RecyclerViewActivity"

        const val LIST_TYPE = "list_type"
        const val LIST_TYPE_VIEW = "list_type_view"
        const val LIST_TYPE_COMPOSE = "list_type_compose"
        const val LIST_TYPE_VIEW_PLUS_COMPOSE = "list_type_view_plus_compose"

    }
}
