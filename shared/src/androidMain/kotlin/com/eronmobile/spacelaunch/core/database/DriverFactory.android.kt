package com.eronmobile.spacelaunch.core.database

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.eronmobile.spacelaunch.db.SpaceLaunchDatabase

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class DriverFactory(private val context: Context) {
    actual fun create(): SqlDriver {
        return AndroidSqliteDriver(SpaceLaunchDatabase.Schema, context, "spacelaunch.db")
    }
}
