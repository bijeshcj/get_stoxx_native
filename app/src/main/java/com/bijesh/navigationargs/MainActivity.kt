package com.bijesh.navigationargs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bijesh.navigationargs.getstoxx.utils.setBackNavigation

import com.bijesh.navigationargs.getstoxx.utils.setToolBar

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setToolBar()
        setBackNavigation()
    }
}