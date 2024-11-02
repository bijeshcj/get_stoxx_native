package com.bijesh.navigationargs.getstoxx.presentation.screens.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModelV3<in Action>: ViewModel() {

    private val _uiState: MutableLiveData<UiState> = MutableLiveData()
    val uiState: LiveData<UiState> = _uiState


    fun submitAction(action: Action){
        handleAction(action)
    }

    fun <T> onSuccess(data:T){
        _uiState.postValue(UiState.OnSuccess(data))
    }

    protected fun onIdle(){
        _uiState.postValue(UiState.OnIdle)
    }

    protected fun onLoading(){
        _uiState.postValue(UiState.OnLoading)
    }

    fun onError(error: Throwable){
        _uiState.postValue(UiState.OnError(error))
    }

    protected abstract fun handleAction(action: Action)


    sealed class UiState{
        object OnIdle: UiState()
        object OnLoading: UiState()
        data class OnSuccess<T>(val holder:T) : UiState()
        data class OnError(val error: Throwable): UiState()
    }

}