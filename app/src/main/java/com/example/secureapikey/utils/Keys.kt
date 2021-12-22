package com.example.secureapikey.utils

object Keys {

    init {
        System.loadLibrary("native-lib")
    }

    external fun apiKey(): String
}