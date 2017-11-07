package com.example.ganeshtikone.kotlinfragment

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity(), OnSwitchFragmentInterface {

    private lateinit var colorFragment: ColorFragment
    private lateinit var switchFragment: SwitchFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createFragments()
        loadFragments()
    }

    /**
     * Create fragment objects
     */
    private fun createFragments() {

        // Create object of ColorFragment
        colorFragment = ColorFragment()

        // Create object of SwitchFragment
        switchFragment = SwitchFragment()

        // Set Delegate on SwitchFragment
        switchFragment.setDelegate(this)


    }

    /**
     * Setup fragment with SupportFragmentManager
     */
    private fun loadFragments() {


        // Load fragment into FrameLayout
        // Using support fragment
        supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, colorFragment, colorFragment.LOGTAG)
                .commit()

        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_switch_container, switchFragment)
                .commit()
    }


    /**
     * Callback method of OnSwitchFragmentInterface
     */
    override fun onToggleButton(backgroundColor: Int) {
        colorFragment.changeBackgroundColor(backgroundColor)
    }
}
