package ru.agladkov.feature_main

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController

class FeedFragment: Fragment(R.layout.fragment_feed) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.feedItemView).setOnClickListener {
            val navOptions = NavOptions.Builder()
                .setEnterAnim(ru.agladkov.uitls.R.anim.slide_in_left)
                .setExitAnim(ru.agladkov.uitls.R.anim.slide_out_left)
                .setPopEnterAnim(ru.agladkov.uitls.R.anim.slide_in_left)
                .setPopExitAnim(ru.agladkov.uitls.R.anim.slide_out_right)
                .build()

            findNavController().navigate(Uri.parse("jetnavapp://detail"), navOptions)
        }
    }
}