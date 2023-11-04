package com.example.navigation_jetcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun nav(){
val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "A" ){
        composable(route = "A"){
            ScreenA(navController)
        }
        composable(route = "B"){
            ScreenB(navController)
        }
        composable(route = "C"){
            ScreenC(navController)
        }
    }
}