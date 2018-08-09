package com.tw.pipeline

import junit.framework.Assert.assertEquals
import org.junit.Test

class SomeClassTest {
    private val someClass = SomeClass()

    @Test
    fun doSomethingShouldSucceed() {
        assertEquals(someClass.doSomething(), 2)
    }
}