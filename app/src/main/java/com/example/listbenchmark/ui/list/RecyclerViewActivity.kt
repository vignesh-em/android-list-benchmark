package com.example.listbenchmark.ui.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.listbenchmark.databinding.ActivityRecyclerViewBinding
import com.example.listbenchmark.ui.fakedata.fakeData
import com.example.listbenchmark.adapter.BenchmarkListAdapter
import com.example.listbenchmark.ui.list.viewtypeproviders.AlternatingViewPlusComposeViewTypeProvider
import com.example.listbenchmark.ui.list.viewtypeproviders.ComposeViewTypeProvider
import com.example.listbenchmark.adapter.ItemViewTypeProvider
import com.example.listbenchmark.ui.list.viewholder.PlantViewHolderFactory
import com.example.listbenchmark.ui.list.viewtypeproviders.ViewViewTypeProvider

class RecyclerViewActivity : ComponentActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupList()
    }

    private fun setupList() {
        BenchmarkListAdapter(
            PlantViewHolderFactory,
            getAdapterType(intent.getStringExtra(LIST_TYPE)),
            PlantDiffUtilCallback
        ).run {
            binding.recyclerView.adapter = this
            submitList(fakeData)
        }
    }

    private fun getAdapterType(listType: String?): ItemViewTypeProvider = when (listType) {
        LIST_TYPE_VIEW -> ViewViewTypeProvider()
        LIST_TYPE_COMPOSE -> ComposeViewTypeProvider()
        else -> AlternatingViewPlusComposeViewTypeProvider()
    }

    companion object {

        private const val TAG = "RecyclerViewActivity"

        const val LIST_TYPE = "list_type"
        const val LIST_TYPE_VIEW = "list_type_view"
        const val LIST_TYPE_COMPOSE = "list_type_compose"
        const val LIST_TYPE_VIEW_PLUS_COMPOSE = "list_type_view_plus_compose"

    }
}
