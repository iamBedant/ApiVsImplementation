package com.iambedant.libraryb

import com.iambedant.libraryd.ClassD

/**
 * Created by @iamBedant on 07/08/17.
 */
class ClassB {

    val b = ClassD()

    fun whereIsMyJoke(): String {
        return b.tellMeAJoke()
    }
}