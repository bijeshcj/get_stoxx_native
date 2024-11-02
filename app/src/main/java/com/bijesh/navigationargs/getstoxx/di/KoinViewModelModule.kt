package com.bijesh.navigationargs.getstoxx.di

import com.bijesh.navigationargs.getstoxx.presentation.screens.view_models.AddStockFragmentViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vmModule = module{
    viewModel {
        AddStockFragmentViewModel(androidContext())
    }
}