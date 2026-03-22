package com.eronmobile.spacelaunch.core.di

import org.koin.core.context.startKoin

fun doInitKoin() {
    startKoin {
        modules(platformModule)
        modules(sharedModules)
    }
}
