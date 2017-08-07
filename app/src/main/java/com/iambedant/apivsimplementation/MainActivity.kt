package com.iambedant.apivsimplementation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.iambedant.librarya.ClassA
import com.iambedant.libraryb.ClassB
import com.iambedant.libraryd.ClassD

class MainActivity : AppCompatActivity() {

    lateinit var mTvJokeA: TextView
    lateinit var mTvJokeB: TextView
    val a = ClassA()
    val b = ClassB()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTvJokeA = findViewById(R.id.textView2)
        mTvJokeB = findViewById(R.id.textView4)

        mTvJokeA.text = getJokeFromA()
        mTvJokeB.text = getJokeFromB()
    }

    fun getJokeFromA(): String {
        return a.whereIsMyJoke()
    }

    fun getJokeFromB(): String {
        return b.whereIsMyJoke()
    }

    fun getJokeFromD(): String {
        return ClassD().tellMeAJoke()
    }

//    fun getJokeFromC(): String {
//        return ClassC().tellMeAJoke()
//    }

}
