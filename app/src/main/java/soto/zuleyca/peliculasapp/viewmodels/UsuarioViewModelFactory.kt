package soto.zuleyca.peliculasapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import soto.zuleyca.peliculasapp.modelos.Repositorio

class UsuarioViewModelFactory(private val repo: Repositorio): ViewModelProvider.Factory {

    override fun <T: ViewModel> create(modelClass: Class<T>): T{

        if(modelClass.isAssignableFrom(UsuarioViewModel::class.java)){
            return UsuarioViewModel(repo) as T
        }
        throw IllegalArgumentException("Desconocido")
    }
}