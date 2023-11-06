package com.example.threefragmentsapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button1 = view.findViewById(R.id.button1)
        button2 = view.findViewById(R.id.button2)
        button3 = view.findViewById(R.id.button3)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()

        button1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment123, firstFragment)
                .addToBackStack(null)
                .commit()

        }

        button2.setOnClickListener {
            childFragmentManager.beginTransaction().replace(R.id.fragment123, secondFragment).addToBackStack( null).commit()
        }

        button3.setOnClickListener {
            childFragmentManager.beginTransaction().replace(R.id.fragment123, thirdFragment).addToBackStack( null).commit()
        }
    }
}