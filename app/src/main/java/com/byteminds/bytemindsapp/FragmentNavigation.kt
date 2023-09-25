package com.byteminds.bytemindsapp

import androidx.fragment.app.Fragment

interface FragmentNavigation {
    fun navegarFragmento(fragment: Fragment,addToStack:Boolean)
}