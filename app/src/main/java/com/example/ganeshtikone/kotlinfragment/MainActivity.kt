package com.example.ganeshtikone.kotlinfragment

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupFragment()
    }

    /**
     * Setup fragment with SupportFragmentManager
     */
    private fun setupFragment() {

        // Create object of fragment
        val colorFragment = ColorFragment()
        val switchFragment = SwitchFragment()

        // Load fragment into FrameLayout
        // Using support fragment
        supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container,colorFragment,colorFragment.LOGTAG)
                .commit()

        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_switch_container,switchFragment)
                .commit()
    }
}
