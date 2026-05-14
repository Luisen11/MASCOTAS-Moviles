package com.example.proyectomascota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectomascota.ui.theme.ProyectoMascotaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoMascotaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MascotaLuisEnrique()
                }
            }
        }
    }
}

@Composable
fun MascotaLuisEnrique() {
    // El Box permite poner la imagen DEBAJO de los textos
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // IMAGEN DE FONDO (Asegúrate de tener una imagen en res/drawable llamada 'mascota')
        // Si no tienes una, puedes comentar esta línea de Image temporalmente
        Image(
            painter = painterResource(id = R.drawable.mascota),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp), // Padding solicitado
            verticalArrangement = Arrangement.Center, // Alineación vertical
            horizontalAlignment = Alignment.CenterHorizontally // Alineación horizontal
        ) {
            Text(
                text = "TOMAS",
                fontSize = 48.sp, // Fuente grande como pide la tarea
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "Mi gato",
                fontSize = 18.sp,
                color = Color.LightGray,
                modifier = Modifier.padding(top = 8.dp)
            )

            Spacer(modifier = Modifier.height(50.dp))


            Text(
                text = "Por: Rodriguez Cruz Luis Enrique",
                fontSize = 14.sp,
                color = Color.Black
            )
        }
    }
}