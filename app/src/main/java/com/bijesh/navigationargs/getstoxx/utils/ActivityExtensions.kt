package com.bijesh.navigationargs.getstoxx.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.bijesh.navigationargs.R

fun AppCompatActivity.setToolBar(){
    setSupportActionBar(findViewById(R.id.toolBarApp))
}

fun AppCompatActivity.setBackNavigation(show: Boolean = true){
    val navController = findNavController(R.id.fragment)
    val config = AppBarConfiguration(navController.graph)
    findViewById<Toolbar>(R.id.toolBarApp).setupWithNavController(navController, config)
}