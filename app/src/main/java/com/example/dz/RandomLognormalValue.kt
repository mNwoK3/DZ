
package com.example.dz

import java.util.Random
import kotlin.math.exp
import kotlin.math.sqrt

class RandomLognormalValue {
    companion object {
        fun randomLognormalValue(mean: Double, variance: Double): Double {
            val a: Double = Random().nextGaussian() * sqrt(variance) + mean // Андрей Спирихин Кринж
            return exp(a)
        }
    }
}