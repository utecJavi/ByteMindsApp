package com.byteminds.bytemindsapp

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.content.res.AppCompatResources


class Registro : Fragment() {

    private lateinit var editTextNombre :EditText
    private lateinit var  editTextCorreo : EditText
    private lateinit var  editTextPwd : EditText
    private lateinit var  editTextPwdConfirmacion : EditText


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =inflater.inflate(R.layout.fragment_registro, container, false)

        view.findViewById<Button>(R.id.navLoginRegistroBtn).setOnClickListener{

            var navRegistrar = activity as FragmentNavigation
            navRegistrar.navegarFragmento( Login() , true)
        }

         editTextNombre = view.findViewById<EditText>(R.id.editTextNombre)
         editTextCorreo = view.findViewById<EditText>(R.id.editTextCorreo)
         editTextPwd = view.findViewById<EditText>(R.id.editTextPwd)
        editTextPwdConfirmacion = view.findViewById<EditText>(R.id.editTextPwdConfirmacion)


        view.findViewById<Button>(R.id.registrarBtn).setOnClickListener{
        validarDatosRegistro()
        }

        return view
    }

    private fun validarDatosRegistro(){
        val icon = AppCompatResources.getDrawable(requireContext(),R.drawable.icon_warning)
        icon?.setBounds(0,0,icon.intrinsicWidth,icon.intrinsicHeight)
        when{
            TextUtils.isEmpty(editTextNombre.text.toString().trim())->{
                editTextNombre.setError("Ingrese su nombre completo, por favor",icon)
            }
            TextUtils.isEmpty(editTextCorreo.text.toString().trim())->{
                editTextCorreo.setError("Ingrese su correo electronico, por favor",icon)
            }
            TextUtils.isEmpty(editTextPwd.text.toString().trim())->{
                editTextPwd.setError("Ingrese una contraseña, por favor",icon)
            }
            TextUtils.isEmpty(editTextPwdConfirmacion.text.toString().trim())->{
                editTextPwdConfirmacion.setError("Repita la contraseña, por favor",icon)
            }
        }
    }

}