package com.example.videoproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.videoproject.fragment.MainFragment
import com.example.videoproject.fragment.SecondFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (bottomNavigationView_activity_main).setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item_first -> {
                    onClickBottomFirst()
                }
                R.id.item_second -> {
                    onClickBottomSecond()
                }
            }
            true
        }
    }

    @SuppressLint("CommitTransaction")
    fun getFragmentM() = supportFragmentManager.beginTransaction()

    private fun onClickBottomFirst() {
        getFragmentM().replace(R.id.frameL_activity_main, MainFragment.newInstance()).commit()
    }

    private fun onClickBottomSecond() {
        getFragmentM().replace(R.id.frameL_activity_main, SecondFragment.newInstance()).commit()
    }
}
