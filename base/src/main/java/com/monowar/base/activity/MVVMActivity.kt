package com.monowar.base.activity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

abstract class MVVMActivity<VM : ViewModel> : BaseActivity() {

    @Inject
    lateinit var vmFactory: dagger.Lazy<ViewModelProvider.Factory>

    /**
     * @return View Model class type. Need to create an instance of the view model.
     */
    abstract val vmClass: Class<VM>

    val viewModel by lazy { ViewModelProviders.of(getActivity(), vmFactory.get()).get(vmClass) }
}