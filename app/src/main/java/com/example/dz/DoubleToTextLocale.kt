package com.example.dz

class DoubleToTextLocale {
    companion object {
        fun convert(num: Double, locale: String = "RU"): String {
            return num.toString()
        }
    }
}