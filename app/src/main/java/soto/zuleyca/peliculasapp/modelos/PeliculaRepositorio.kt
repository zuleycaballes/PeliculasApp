package soto.zuleyca.peliculasapp.modelos

import soto.zuleyca.peliculasapp.R

class PeliculaRepositorio {
    private val peliculas = mutableListOf(
        Pelicula(1, "Iron Man", "Accion", "2h7min","Un empresario millonario construye un traje blindado y lo usa para combatir el crimen y el terrorismo.", R.drawable.bootstrap_person_circle),
        Pelicula(2, "Batman", "Accion", "2h56min", "Batman explora la corrupción existente en la ciudad de Gotham y el vínculo de esta con su propia familia. Además, entra en conflicto con un asesino en serie conocido como \"el Acertijo\".",R.drawable.bootstrap_person_circle),
        Pelicula(3, "Chicas Pesadas", "Drama", "1h37min", "Recién entrando a la prepa, una adolescente entabla amistad con tres populares, pero también manipuladoras estudiantes.", R.drawable.bootstrap_person_circle),
        Pelicula(4, "Crepusculo", "Romance", "2h2min", "Bella Swan se va a vivir con su padre al pequeño pueblo de Forks, donde conoce a Edward, un atractivo y misterioso chico del que se enamora y quien esconde un gran secreto: es un vampiro. Pero la familia del chico guarda una peculiaridad, y es que no se alimenta de sangre humana.", R.drawable.bootstrap_person_circle),
        Pelicula(5, "Frozen", "Musical", "1h42min", "Una joven princesa valiente se establece con un montañista para encontrar a su hermana, cuyos poderes gélidos han atrapado a su reino en el invierno eterno. Con letras en pantalla y nieve saltando para seguir las canciones.", R.drawable.bootstrap_person_circle)
    )

    fun getPeliculas(): List<Pelicula>{
        return peliculas.toList()
    }

    fun agregarPeliculas(pelicula: Pelicula){
        peliculas.add(pelicula)
    }

    fun eliminarPelicula(id: Int){
        peliculas.removeIf { it.id == id }
    }
}