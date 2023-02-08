package com.example.listbenchmark.ui

import android.content.Context
import androidx.compose.ui.platform.ComposeView

object ViewHolderCreator {
    fun createViewHolder(context: Context, viewType: Int): BaseViewHolder {
        return when (viewType) {
            VIEW_TYPE_COMPOSE_VEW, VIEW_TYPE_VIEW -> ComposeViewHolder(ComposeView(context))
            else -> ComposeViewHolder(ComposeView(context))
        }
    }

    const val VIEW_TYPE_COMPOSE_VEW = 0
    const val VIEW_TYPE_VIEW = 1
}