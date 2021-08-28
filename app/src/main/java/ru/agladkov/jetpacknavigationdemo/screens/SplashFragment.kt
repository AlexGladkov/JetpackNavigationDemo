package ru.agladkov.jetpacknavigationdemo.screens

import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import ru.agladkov.jetpacknavigationdemo.R
import ru.agladkov.uitls.navigation.NavCommand
import ru.agladkov.uitls.navigation.NavCommands
import ru.agladkov.uitls.navigation.navigate

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val token = requireContext().getSharedPreferences(getString(R.string.app_name), 0)
            .getString("TOKEN_KEY", "")

        if (token.isNullOrBlank()) {
            navigate(
                NavCommand(
                    NavCommands.DeepLink(
                        url = Uri.parse("jetnavapp://login"),
                        isModal = true,
                        isSingleTop = true
                    )
                )
            )
        } else {
            navigate(
                NavCommand(
                    NavCommands.DeepLink(
                        url = Uri.parse("jetnavapp://main"),
                        isModal = true,
                        isSingleTop = true
                    )
                )
            )
        }
    }
}