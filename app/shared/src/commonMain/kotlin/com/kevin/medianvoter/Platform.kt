package com.kevin.medianvoter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform