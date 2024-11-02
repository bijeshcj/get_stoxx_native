package com.bijesh.navigationargs.getstoxx.utils

import android.app.DatePickerDialog
import android.icu.util.Calendar
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


//fun Fragment.openCalendar(){
//    // Get the current date
//    val calendar = Calendar.getInstance()
//    val year = calendar.get(Calendar.YEAR)
//    val month = calendar.get(Calendar.MONTH)
//    val day = calendar.get(Calendar.DAY_OF_MONTH)
//
//    // Create and show the DatePickerDialog
//    val datePickerDialog = DatePickerDialog(context!!, { _, selectedYear, selectedMonth, selectedDay ->
//        // Handle the selected date here
//        val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
//
//    }, year, month, day)
//
//    datePickerDialog.show()
//}