package soto.zuleyca.peliculasapp.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import soto.zuleyca.peliculasapp.modelos.Pelicula
import soto.zuleyca.peliculasapp.modelos.PeliculaRepositorio

class PeliculaViewModel(val repo: PeliculaRepositorio) : ViewModel() {

    private val _peliculas = mutableStateOf<List<Pelicula>>(emptyList())
    val peliculas: State<List<Pelicula>> = _peliculas

    init {
        cargarPeliculas()
    }

    private fun cargarPeliculas() {
        _peliculas.value = repo.getPeliculas()
    }
}