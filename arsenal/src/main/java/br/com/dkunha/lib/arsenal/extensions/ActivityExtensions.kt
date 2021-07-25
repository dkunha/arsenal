package br.com.dkunha.lib.arsenal.extensions

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

fun AppCompatActivity.bindingContentView(layout: Int): ViewDataBinding {
    return bindingContentView<ViewDataBinding>(layout)
}

fun <T> AppCompatActivity.bindingContentView(layout: Int): T {
    return DataBindingUtil.setContentView<ViewDataBinding>(this, layout)
        .also { it.lifecycleOwner = this } as T
}
