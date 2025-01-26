package com.example.perso_appli_mobile_musique.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

// Définition des couleurs personnalisées
val LightPrimaryColor = Color(0xFF6200EE) // Violet foncé
val LightSecondaryColor = Color(0xFF03DAC5) // Cyan

// Définition du schéma de couleurs clair (light color scheme)
private val LightColors = lightColorScheme(
    primary = LightPrimaryColor,
    secondary = LightSecondaryColor,
    // Autres couleurs peuvent être définies ici si nécessaire (background, surface, etc.)
)

// Définition de la typographie personnalisée
val CustomTypography = Typography(
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = Color.Black
    ),
    titleLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        color = Color.Black
    ),
    labelLarge = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        color = Color.Gray
    )
)

@Composable
fun AppliMusiqueTheme(content: @Composable () -> Unit) {
    // Appliquer le thème global à l'application
    MaterialTheme(
        colorScheme = LightColors,
        typography = CustomTypography,
        content = content
    )
}
