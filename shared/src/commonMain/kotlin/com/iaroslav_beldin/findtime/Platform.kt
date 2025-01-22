package com.iaroslav_beldin.findtime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform