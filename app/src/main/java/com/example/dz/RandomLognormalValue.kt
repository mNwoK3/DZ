
package com.example.dz

import java.util.Random
import kotlin.math.exp
import kotlin.math.ln
import kotlin.math.sqrt
import kotlin.math.pow
class RandomLognormalValue {
    companion object {
        fun randomLognormalValue(mu: Double, sigmaSq: Double): Double {

            val Mean = ln(mu.pow(2) / sqrt(mu.pow(2) + sigmaSq)) // хз
            val Dev = sqrt(ln(1 + (sigmaSq / mu.pow(2))))

            val a: Double = Random().nextGaussian() * Dev + Mean
            return exp(a)
        }

    }
}