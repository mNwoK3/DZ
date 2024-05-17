package com.example.dz

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(6,2 + 4)
    }
    @Test
    fun doubleToTextLocale_isCorrect() {
        assertEquals("3.7", DoubleToTextLocale.convert(3.7))
        assertEquals("3,7", DoubleToTextLocale.convert(3.7, "RU"))
    }
}