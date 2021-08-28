package ru.agladkov.feature_detail

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private var count: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        count = arguments?.getInt(COUNT_KEY) ?: 0

        view.findViewById<TextView>(R.id.detailTextView).text = count.toString()
        view.findViewById<TextView>(R.id.detailTextView).setOnClickListener {
            findNavController().navigate(
                R.id.action_detailFragment_self,
                bundleOf(
                    COUNT_KEY to (count + 1)
                )
            )
        }
    }

    companion object {
        const val COUNT_KEY = "countKey"
    }
}