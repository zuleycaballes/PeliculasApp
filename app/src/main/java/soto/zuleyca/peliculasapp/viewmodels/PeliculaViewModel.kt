package soto.zuleyca.peliculasapp.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import soto.zuleyca.peliculasapp.R
import soto.zuleyca.peliculasapp.modelos.Pelicula
import soto.zuleyca.peliculasapp.modelos.PeliculaRepositorio

class PeliculaViewModel(val repo: PeliculaRepositorio): ViewModel() {

    private val _peliculas = mutableStateOf<List<Pelicula>>(emptyList())
    val peliculas: State<List<Pelicula>> = _peliculas

    init{
        getPeliculas()
    }

    private fun getPeliculas(){
        _peliculas.value = repo.getPeliculas()
    }

    fun agregarPelicula(titulo: String, categoria: String, duracion: String, sinopsis: String, fotoUri: String?){
        val nuevoId = peliculas.value.size + 1
        val peli = Pelicula(nuevoId, titulo, categoria, duracion, sinopsis, R.drawable.bootstrap_person_circle, fotoUri)
        repo.agregarPeliculas(peli)

        _peliculas.value = repo.getPeliculas()
    }

    fun eliminarPelicula(id: Int){
        repo.eliminarPelicula(id)
        _peliculas.value = repo.getPeliculas()
    }
}