package ru.agladkov.feature_main

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.fragment.NavHostFragment

class MainFragment: Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("TAG", "Username -> ${arguments?.get(USERNAME)}")
        Log.e("TAG", "City -> ${arguments?.get(CITY)}")

        val bottomNavigationView = view.findViewById<BottomNavigationView>(R.id.mainBottomNavigationView)
        val navController = (childFragmentManager.findFragmentById(R.id.mainContainerView) as NavHostFragment)
            .navController
        bottomNavigationView.setupWithNavController(navController)
    }

    companion object {
        const val USERNAME = "username"
        const val CITY = "city"
    }
}