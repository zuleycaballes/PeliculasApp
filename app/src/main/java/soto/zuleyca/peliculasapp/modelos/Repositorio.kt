package soto.zuleyca.peliculasapp.modelos

import soto.zuleyca.peliculasapp.R

class Repositorio {

    private val usuarios = mutableListOf(
            Usuario(1, "Mario", "mparra@tec.mx", 30, R.drawable.bootstrap_person_circle),
            Usuario(2, "Luis", "luis@tec.mx", 23, R.drawable.bootstrap_person_circle),
            Usuario(3, "Jesus", "jesus@tec.mx", 22, R.drawable.bootstrap_person_circle),
            Usuario(4, "Lucia", "lucia@tec.mx", 20, R.drawable.bootstrap_person_circle),
    )

    fun getUsuarios(): List<Usuario>{
        return usuarios.toList()
    }

    fun agregarUsuario(usuario: Usuario){
        usuarios.add(usuario)
    }
}