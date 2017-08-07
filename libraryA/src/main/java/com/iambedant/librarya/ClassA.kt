package com.iambedant.librarya

import com.iambedant.libraryc.ClassC

/**
 * Created by @iamBedant on 07/08/17.
 */
class ClassA {

    val c = ClassC()

    fun whereIsMyJoke(): String {
        return c.tellMeAJoke()
    }
}