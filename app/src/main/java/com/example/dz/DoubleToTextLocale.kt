package com.example.dz

class DoubleToTextLocale {
    companion object {
        public fun convert(num: Double, locale: String = "EN"): String {
            return if (locale != "RU") {
                num.toString()
            } else {
                num.toString().replace(".", ",")
            }

        }
    }
}