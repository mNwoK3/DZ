
package com.example.dz

import java.util.Random
import kotlin.math.exp
import kotlin.math.sqrt

class RandomLognormalValue {
    companion object {
        fun randomLognormalValue(mean: Double, variance: Double): Double {
            var a: Double = Random().nextGaussian() * mean + sqrt(variance)
            return exp(a)
        }

    }
}