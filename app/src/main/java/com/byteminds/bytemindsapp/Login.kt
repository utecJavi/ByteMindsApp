package com.byteminds.bytemindsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Login : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =inflater.inflate(R.layout.fragment_login, container, false)

        view.findViewById<Button>(R.id.registroLoginBtn).setOnClickListener{

            var navRegistrar = activity as FragmentNavigation
            navRegistrar.navegarFragmento( Registro() , true)
        }


        return view
    }

}