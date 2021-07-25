package br.com.dkunha.lib.arsenal.extensions

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

fun Fragment.bindingContentView(inflate: LayoutInflater, layout: Int, viewGroup: ViewGroup?): ViewDataBinding {
    return bindingContentView<ViewDataBinding>(inflate, layout, viewGroup)
}

fun <T> Fragment.bindingContentView(inflate: LayoutInflater, layout: Int, viewGroup: ViewGroup?): T {
    return DataBindingUtil.inflate<ViewDataBinding>(inflate, layout, viewGroup, false)
        .also { it.lifecycleOwner = viewLifecycleOwner } as T
}