package com.eronmobile.spacelaunch.core.di

import com.eronmobile.spacelaunch.core.database.DriverFactory
import org.koin.dsl.module

val platformModule = module {
    single { DriverFactory(get()) }
}
