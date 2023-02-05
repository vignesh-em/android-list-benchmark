package com.example.listbenchmark.ui.home

sealed class HomeListItem(internal val title: String) {
    object ComposeLazyColumn : HomeListItem("Compose LazyColumn")
    object NativeRecyclerView : HomeListItem("Native RecyclerView")
    object ComposeViewInRecyclerView : HomeListItem("ComposeView + RecyclerView")
    object XmlViewComposeViewInRecyclerView : HomeListItem("XML View + ComposeView + RecyclerView")
}
