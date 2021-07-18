package ru.agladkov.jetpacknavigationdemo.screens

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.agladkov.jetpacknavigationdemo.R

class FeedFragment: Fragment(R.layout.fragment_feed) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.feedItemView).setOnClickListener {
            findNavController().navigate(R.id.action_feedFragment_to_detailFragment2)
        }
    }
}