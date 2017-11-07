package com.example.ganeshtikone.kotlinfragment


import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple ColorFragment subclass.
 */
class ColorFragment : Fragment() {

    val LOGTAG = ColorFragment::class.simpleName
    private lateinit var backgroundView: View

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d(LOGTAG, "onAttach executed")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOGTAG, "onCreate executed")
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.d(LOGTAG, "onCreateView executed")

        // Inflate the layout for this fragment
        val rootView = inflater!!.inflate(R.layout.fragment_color, container, false)
        backgroundView = rootView.findViewById(R.id.colorFragmentView)

        return rootView
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(LOGTAG, "onActivityCreated executed")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOGTAG, "onStart executed")
    }


    override fun onResume() {
        super.onResume()
        Log.d(LOGTAG, "onResume executed")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOGTAG, "onPause executed")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOGTAG, "onStop executed")
    }

    override fun onDestroyView() {
        Log.d(LOGTAG, "onDestroyView executed")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(LOGTAG, "onDestroy executed")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(LOGTAG, "onDetach executed")
        super.onDetach()
    }

    /**
     * Public function to change background color of
     * ColorFragment
     */
    fun changeBackgroundColor(backgroundColor:Int){
        backgroundView.setBackgroundColor(backgroundColor)
    }


}// Required empty public constructor
