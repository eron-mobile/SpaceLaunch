package com.eronmobile.spacelaunch

import android.app.Application
import com.eronmobile.spacelaunch.core.di.platformModule
import com.eronmobile.spacelaunch.core.di.sharedModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SpaceLaunchApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SpaceLaunchApp)
            modules(platformModule)
            modules(sharedModules)
        }
    }
}
