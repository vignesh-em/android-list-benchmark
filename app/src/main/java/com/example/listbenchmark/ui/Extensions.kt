package com.example.listbenchmark.ui

import android.content.Intent

const val LIST_TYPE = "list_type"
const val LIST_TYPE_VIEW = "list_type_view"
const val LIST_TYPE_COMPOSE = "list_type_compose"
const val LIST_TYPE_VIEW_PLUS_COMPOSE = "list_type_view_plus_compose"
const val GRID_SPAN_COUNT = "grid_span_count"

fun Intent.getListType(): String? {
    return getStringExtra(LIST_TYPE)
}

fun Intent.getGridSpanCount(): Int? {
    val spanCount = getIntExtra(GRID_SPAN_COUNT, 0)
    return if (spanCount == 0) null
    else spanCount
}