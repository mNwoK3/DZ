package com.example.dz

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun doubleToTextLocale_isCorrect() {
        assertEquals("3.7", DoubleToTextLocale.convert(3.7))
        assertEquals("3,7", DoubleToTextLocale.convert(3.7, "RU"))
    }
}