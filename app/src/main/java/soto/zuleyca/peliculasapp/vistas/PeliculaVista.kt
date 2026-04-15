package soto.zuleyca.peliculasapp.vistas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import soto.zuleyca.peliculasapp.modelos.Pelicula
import soto.zuleyca.peliculasapp.viewmodels.PeliculaViewModel

@Composable
fun PeliculaScreen(viewModel: PeliculaViewModel) {
    val peliculas = viewModel.peliculas.value

    Scaffold(
        topBar = { (
                Text(text = "Catálogo de Películas")
            )
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(17.dp)
        ) {
            items(peliculas) { pelicula ->
                PeliculaCard(pelicula)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Composable
fun PeliculaCard(pelicula: Pelicula) {
    Card(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(17.dp)
        ) {
            Text(text = pelicula.titulo)
            Text(text = pelicula.categoria)
            Text(text = "${pelicula.duracion} min")
            Text(text = pelicula.sinopsis)
        }
    }
}