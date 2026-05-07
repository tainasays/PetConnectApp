package com.example.petconnectapp.ui.nav

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import com.example.petconnectapp.ui.HomePage
import com.example.petconnectapp.ui.ListPage
import com.example.petconnectapp.ui.MapPage
import com.example.petconnectapp.ui.HomePage
import androidx.navigation.compose.composable
import com.example.petconnectapp.MainViewModel


@Composable
fun MainNavHost(navController: NavHostController,
        modifier: Modifier = Modifier,
                viewModel: MainViewModel
) {
    NavHost(navController, startDestination = Route.Home) {
        composable<Route.Home>
        {
            HomePage(
                modifier = modifier,
                viewModel = viewModel)
        }

        composable<Route.List>
        {
            ListPage(modifier = modifier,
            viewModel = viewModel)
        }

        composable<Route.Map>
        {
            MapPage(
            modifier = modifier,
            viewModel = viewModel)
        }
    }
}