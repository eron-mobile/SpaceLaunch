package com.eronmobile.spacelaunch.core.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

expect fun platformEngine(): HttpClientEngineFactory<*>

expect val isDebug: Boolean

private val SENSITIVE_HEADERS = setOf(
    "authorization",
    "cookie",
    "set-cookie",
    "proxy-authorization",
)

fun createHttpClient(): HttpClient {
    return HttpClient(platformEngine()) {
        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                    prettyPrint = false
                }
            )
        }
        install(Logging) {
            level = if (isDebug) LogLevel.HEADERS else LogLevel.NONE
            sanitizeHeader { header -> header.lowercase() in SENSITIVE_HEADERS }
        }
        defaultRequest {
            contentType(ContentType.Application.Json)
        }
    }
}
