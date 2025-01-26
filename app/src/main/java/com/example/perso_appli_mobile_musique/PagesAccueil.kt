package com.example.perso_appli_mobile_musique.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController

// Créez des fonctions similaires pour PageAccueilMessage, etc.
@Composable
fun NavHostPages(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "PageAccueilMusique"
    ) {
        composable("PageAccueilMusique") {
            PageAccueilMusique(navController = navController)
        }
        // Ajoutez d'autres destinations de navigation ici
    }
}