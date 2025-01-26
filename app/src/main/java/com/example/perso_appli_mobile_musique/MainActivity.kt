package com.example.perso_appli_mobile_musique

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import com.example.perso_appli_mobile_musique.components.BarreMenu
import com.example.perso_appli_mobile_musique.pages.PageAccueilMusique
import com.example.perso_appli_mobile_musique.pages.PageAccueilMessages
import com.example.perso_appli_mobile_musique.ui.theme.AppliMusiqueTheme
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.coroutines.CoroutineScope

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppliMusiqueTheme {
                val navController = rememberNavController()
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Open)
                val scope = rememberCoroutineScope()

                ModalNavigationDrawer(
                    drawerState = drawerState,
                    drawerContent = {
                        BarreMenu(navController = navController, drawerState = drawerState, scope = scope)
                    },
                    content = {
                        Scaffold(
                            modifier = Modifier.fillMaxSize(),
                            content = {
                                // NavHost pour gérer les pages
                                NavHost(
                                    navController = navController,
                                    startDestination = "PageAccueilMusique"
                                ) {
                                    composable("PageAccueilMusique") {
                                        PageAccueilMusique(
                                            navController
                                        )
                                    }
                                    composable("PageAccueilMessages") {
                                        PageAccueilMessages(
                                            navController
                                        )
                                    }
                                    // Ajouter d'autres pages ici si nécessaire
                                }
                            }
                        )
                    }
                )
            }
        }
    }
}
