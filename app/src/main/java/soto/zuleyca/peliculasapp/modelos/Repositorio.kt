package soto.zuleyca.peliculasapp.modelos

class Repositorio {
    fun getUsuarios(): List<Usuario>{
        return listOf(
            Usuario(1, "Mario", "mparra@tec.mx", 30),
            Usuario(2, "Luis", "luis@tec.mx", 23),
            Usuario(3, "Jesus", "jesus@tec.mx", 22),
            Usuario(4, "Lucia", "lucia@tec.mx", 20),
        )
    }
}