package ru.agladkov.feature_login

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import ru.agladkov.uitls.navigation.NavCommand
import ru.agladkov.uitls.navigation.NavCommands
import ru.agladkov.uitls.navigation.navigate
import java.util.*

class LoginFragment: Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.loginTextView).setOnClickListener {
            requireContext().getSharedPreferences(getString(R.string.app_name), 0)
                .edit().putString("TOKEN_KEY", "Some Token").apply()
            navigate(
                NavCommand(
                    NavCommands.DeepLink(
                        url = Uri.parse("jetnavapp://main/Alex Gladkov/Moscow"),
                        isModal = true,
                        isSingleTop = true
                    )
                )
            )
        }
    }
}