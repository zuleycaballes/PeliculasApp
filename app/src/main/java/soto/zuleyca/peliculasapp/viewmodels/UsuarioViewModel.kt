package soto.zuleyca.peliculasapp.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import soto.zuleyca.peliculasapp.modelos.Repositorio
import soto.zuleyca.peliculasapp.modelos.Usuario

class UsuarioViewModel(val repo: Repositorio) : ViewModel() {

    private val _usuarios = mutableStateOf<List<Usuario>>(emptyList())
    val usuarios: State<List<Usuario>> = _usuarios

    init {
        getUsuarios()
    }

    private fun getUsuarios() {
        _usuarios.value = repo.getUsuarios()
    }
}
