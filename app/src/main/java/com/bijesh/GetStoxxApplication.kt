package com.bijesh

import android.app.Application
import com.bijesh.navigationargs.getstoxx.di.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GetStoxxApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@GetStoxxApplication)
            modules(vmModule)
        }

    }
}