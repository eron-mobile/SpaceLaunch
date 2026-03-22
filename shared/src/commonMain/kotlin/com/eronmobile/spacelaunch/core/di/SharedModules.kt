package com.eronmobile.spacelaunch.core.di

import com.eronmobile.spacelaunch.core.database.DriverFactory
import com.eronmobile.spacelaunch.core.network.createHttpClient
import com.eronmobile.spacelaunch.db.SpaceLaunchDatabase
import org.koin.core.module.Module
import org.koin.dsl.module

val networkModule = module {
    single { createHttpClient() }
}

val databaseModule = module {
    single { get<DriverFactory>().create() }
    single { SpaceLaunchDatabase(get()) }
}

val sharedModules: List<Module> = listOf(
    networkModule,
    databaseModule,
)
