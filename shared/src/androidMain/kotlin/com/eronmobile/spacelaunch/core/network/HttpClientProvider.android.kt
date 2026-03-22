package com.eronmobile.spacelaunch.core.network

import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.okhttp.OkHttp

actual fun platformEngine(): HttpClientEngineFactory<*> = OkHttp
