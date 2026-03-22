package com.eronmobile.spacelaunch.core.network

import com.eronmobile.spacelaunch.shared.BuildConfig
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.okhttp.OkHttp

actual fun platformEngine(): HttpClientEngineFactory<*> = OkHttp

actual val isDebug: Boolean = BuildConfig.DEBUG
