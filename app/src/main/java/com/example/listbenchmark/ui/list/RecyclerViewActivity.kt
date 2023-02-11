package com.example.listbenchmark.ui.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listbenchmark.adapter.BenchmarkListAdapter
import com.example.listbenchmark.adapter.ItemViewTypeProvider
import com.example.listbenchmark.databinding.ActivityRecyclerViewBinding
import com.example.listbenchmark.ui.LIST_TYPE_COMPOSE
import com.example.listbenchmark.ui.LIST_TYPE_VIEW
import com.example.listbenchmark.ui.fakedata.fakeData
import com.example.listbenchmark.ui.getGridSpanCount
import com.example.listbenchmark.ui.getListType
import com.example.listbenchmark.ui.list.viewholder.PlantViewHolderFactory
import com.example.listbenchmark.ui.list.viewtypeproviders.AlternatingViewPlusComposeViewTypeProvider
import com.example.listbenchmark.ui.list.viewtypeproviders.ComposeViewTypeProvider
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
            getViewTypeProvider(intent.getListType()),
            PlantDiffUtilCallback
        ).run {
            binding.recyclerView.layoutManager = getLayoutManager(intent.getGridSpanCount())
            binding.recyclerView.adapter = this
            submitList(fakeData)
        }
    }

    private fun getLayoutManager(gridSpanCount: Int?): RecyclerView.LayoutManager {
        return if (gridSpanCount == null) LinearLayoutManager(baseContext)
        else GridLayoutManager(baseContext, gridSpanCount)
    }

    private fun getViewTypeProvider(listType: String?): ItemViewTypeProvider = when (listType) {
        LIST_TYPE_VIEW -> ViewViewTypeProvider()
        LIST_TYPE_COMPOSE -> ComposeViewTypeProvider()
        else -> AlternatingViewPlusComposeViewTypeProvider()
    }
}
