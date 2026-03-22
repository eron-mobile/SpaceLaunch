package com.eronmobile.spacelaunch

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform