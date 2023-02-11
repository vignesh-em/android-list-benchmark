package com.example.listbenchmark.ui.home

sealed class HomeListItem(internal val title: String) {
    object ComposeLazyColumn : HomeListItem("LazyColumn")
    object ComposeLazyVerticalGrid : HomeListItem("LazyVerticalGrid")
    object NativeRecyclerView : HomeListItem("XML in Recycler")
    object NativeRecyclerViewGrid : HomeListItem("XML in Recycler - Grid")
    object ComposeViewInRecyclerView : HomeListItem("Composable in Recycler")
    object ComposeViewInRecyclerViewGrid : HomeListItem("Composable in Recycler - Grid")
    object XmlViewComposeViewInRecyclerView : HomeListItem("XML + Composable in Recycler")
    object XmlViewComposeViewInRecyclerViewGrid :
        HomeListItem("XML + Composable in Recycler - Grid")
}
