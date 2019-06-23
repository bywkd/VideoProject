package com.example.videoproject.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.videoproject.R

class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val currentView = inflater.inflate(R.layout.fragment_second, container, false)
        // Inflate the layout for this fragment
        return currentView
    }

    companion object {
        fun newInstance() =
            SecondFragment().apply {
                //                arguments = Bundle().apply {
//                }
            }
    }
}
