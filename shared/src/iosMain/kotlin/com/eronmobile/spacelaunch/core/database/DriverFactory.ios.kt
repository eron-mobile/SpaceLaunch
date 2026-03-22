package com.eronmobile.spacelaunch.core.database

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.eronmobile.spacelaunch.db.SpaceLaunchDatabase

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class DriverFactory {
    actual fun create(): SqlDriver {
        return NativeSqliteDriver(SpaceLaunchDatabase.Schema, "spacelaunch.db")
    }
}
