package com.example.perso_appli_mobile_musique.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.perso_appli_mobile_musique.ThemeChildhood
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MusicNote
import androidx.compose.material.icons.rounded.Message
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape

@Composable
fun BarreMenu(navController: NavController, drawerState: DrawerState, scope: CoroutineScope) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.25f)
            .background(ThemeChildhood.tUnBlueDark, shape = RoundedCornerShape(topEnd = 20.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Text(
            "Menu",
            color = ThemeChildhood.tUnYellow,
            fontWeight = FontWeight.Bold,
            fontSize = 27.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 12.dp)
        )

        // Musique
        IconesBarreMenu(
            navController = navController,
            image = Icons.Rounded.MusicNote,
            page = "PageAccueilMusique",
            drawerState = drawerState,
            scope = scope
        )

        // Messages
        IconesBarreMenu(
            navController = navController,
            image = Icons.Rounded.Message,
            page = "PageAccueilMessages",
            drawerState = drawerState,
            scope = scope
        )

        // Ajouter d'autres options ici si nécessaire
    }
}

@Composable
fun IconesBarreMenu(
    navController: NavController,
    image: ImageVector,
    page: String,
    drawerState: DrawerState,
    scope: CoroutineScope
) {
    Row(
        modifier = Modifier
            .padding(vertical = 12.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = {
                // Naviguer vers la page correspondante et fermer le drawer
                navController.navigate(page) {
                    // Optionnel : éviter d'empiler les pages multiples
                    popUpTo = navController.graph.startDestinationId
                    launchSingleTop = true
                }
                // Lancer une coroutine pour fermer le drawer après la navigation
                scope.launch {
                    drawerState.close()
                }
            },
            modifier = Modifier
                .size(100.dp)
                .background(ThemeChildhood.tUnBlueDark, shape = RoundedCornerShape(10.dp))
        ) {
            Icon(
                imageVector = image,
                contentDescription = null,
                tint = ThemeChildhood.tUnYellow,
                modifier = Modifier.size(60.dp)
            )
        }

        Spacer(modifier = Modifier.width(12.dp)) // Espacement entre l'icône et le texte

    }
}
