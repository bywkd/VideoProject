package com.example.videoproject.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.videoproject.R

class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString("data1")
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val currentView = inflater.inflate(R.layout.fragment_main, container, false)
        return currentView
    }

    companion object {
        fun newInstance(): MainFragment {
            val currentFragment = MainFragment()
//            val bundle = Bundle()
//            bundle.putString("data1", "data")
//            currentFragment.arguments = bundle
            return currentFragment
        }
    }
}
