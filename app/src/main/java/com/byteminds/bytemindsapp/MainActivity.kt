package com.byteminds.bytemindsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() , FragmentNavigation{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.container,Login())
            .commit()
    }

    override fun navegarFragmento(fragment: Fragment, addToStack: Boolean) {
        val transaction =   supportFragmentManager
            .beginTransaction()
            .replace(R.id.container,fragment)

        if (addToStack){
            transaction.addToBackStack(null)
        }
        transaction.commit()
    }
}