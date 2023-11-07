package com.example.threefragmentsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button1 = view.findViewById(R.id.button1)
        button2 = view.findViewById(R.id.button2)
        button3 = view.findViewById(R.id.button3)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()

        button1.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.fragmentMain, firstFragment)
                .commit()
        }

        button2.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.fragmentMain, secondFragment)
                .commit()
        }

        button3.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.fragmentMain, thirdFragment)
                .commit()
        }
    }
}