package com.example.perso_appli_mobile_musique.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun PageAccueilBlog(navController: NavController) {  // Ajouter navController ici
    Box(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxSize()
                .align(Alignment.Center)
        ) {
            Text(
                "Page Accueil Blog",
                color = Color.Black,
                fontSize = 24.sp
            )
        }
    }
}
