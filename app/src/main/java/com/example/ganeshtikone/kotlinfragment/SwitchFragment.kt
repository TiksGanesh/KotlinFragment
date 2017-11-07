package com.example.ganeshtikone.kotlinfragment


import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.AppCompatButton
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.*


/**
 * A simple SwitchFragment subclass.
 */
class SwitchFragment : Fragment() {

    private lateinit var delegate: OnSwitchFragmentInterface
    private lateinit var toggleButton: AppCompatButton

    private val colorArray = intArrayOf(Color.BLUE, Color.BLACK, Color.CYAN, Color.DKGRAY,
            Color.GRAY, Color.GREEN, Color.MAGENTA, Color.MAGENTA, Color.RED)

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater!!.inflate(R.layout.fragment_switch, container, false)

        toggleButton = rootView.findViewById(R.id.buttonToggleColor);
        toggleButton.setOnClickListener(View.OnClickListener {
            changeColor()
        })
        return rootView
    }

    /**
     * Send delegate event
     * find random color and call callback method
     */
    private fun changeColor() {
        delegate.onToggleButton(colorArray[randomColor()])
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    /**
     * Set Delegate object to delegate event
     */
    fun setDelegate(delegate: OnSwitchFragmentInterface) {
        this.delegate = delegate
    }

    /**
     * Create random number between 0 -8
     * Color array size and first index of array
     * to avoid array out of bound index exception
     */
    private fun randomColor():Int{
        val random = Random()
        return random.nextInt(colorArray.size - 0)
    }

}// Required empty public constructor
