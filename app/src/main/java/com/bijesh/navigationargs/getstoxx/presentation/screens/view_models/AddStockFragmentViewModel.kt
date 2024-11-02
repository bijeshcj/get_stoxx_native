package com.bijesh.navigationargs.getstoxx.presentation.screens.view_models

import android.app.DatePickerDialog
import android.content.Context
import android.icu.util.Calendar
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddStockFragmentViewModel(val context: Context) : BaseViewModelV3<AddStockFragmentViewModel.AddStockAction>() {

    private val _dateSelection = MutableLiveData<String>()
    val dateSelection: LiveData<String> = _dateSelection



    override fun handleAction(action: AddStockAction) {
        when(action){
            is AddStockAction.OpenCalender ->{
                openCalendar(context)
            }
        }
    }

    fun openCalendar(context: Context){
        // Get the current date
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        // Create and show the DatePickerDialog
        val datePickerDialog = DatePickerDialog(context, { _, selectedYear, selectedMonth, selectedDay ->
            // Handle the selected date here
            val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
            _dateSelection.postValue(selectedDate)
            onSuccess(UiState.OpenCalenderSuccess(selectedDate))
        }, year, month, day)

        datePickerDialog.show()
    }

    sealed class AddStockAction{
        object OpenCalender: AddStockAction()
    }

    sealed class UiState{
        class OpenCalenderSuccess(val selectedDate:String): UiState()
    }



}