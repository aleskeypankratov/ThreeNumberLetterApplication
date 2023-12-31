package com.example.threefragmentsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.threefragmentsapplication.letterFragment.A_LetterFragment
import com.example.threefragmentsapplication.letterFragment.B_LetterFragment
import com.example.threefragmentsapplication.letterFragment.C_LetterFragment
import com.example.threefragmentsapplication.numberFragment.FirstNumberFragment
import com.example.threefragmentsapplication.numberFragment.SecondNumberFragment
import com.example.threefragmentsapplication.numberFragment.ThirdNumberFragment

class MainFragment : Fragment() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var buttonA: Button
    private lateinit var buttonB: Button
    private lateinit var buttonC: Button

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

        buttonA = view.findViewById(R.id.buttonA)
        buttonB = view.findViewById(R.id.buttonB)
        buttonC = view.findViewById(R.id.buttonC)

        val firstNumberFragment = FirstNumberFragment()
        val secondNumberFragment = SecondNumberFragment()
        val thirdNumberFragment = ThirdNumberFragment()

        val firstLetterFragment = A_LetterFragment()
        val secondLetterFragment = B_LetterFragment()
        val thirdLetterFragment = C_LetterFragment()

        fun addNumberFragment(fragment: Fragment) {
            childFragmentManager.beginTransaction()
                .replace(R.id.fragmentNumber, fragment)
                .addToBackStack(fragment.id.toString())
                .commit()
        }

        fun addLetterFragment(fragment: Fragment) {
            childFragmentManager.beginTransaction()
                .replace(R.id.fragmentLetter, fragment)
                .addToBackStack(fragment.id.toString())
                .commit()
        }

        button1.setOnClickListener {
            addNumberFragment(firstNumberFragment)
        }

        button2.setOnClickListener {
            addNumberFragment(secondNumberFragment)
        }

        button3.setOnClickListener {
            addNumberFragment(thirdNumberFragment)
        }

        buttonA.setOnClickListener {
            addLetterFragment(firstLetterFragment)
        }

        buttonB.setOnClickListener {
            addLetterFragment(secondLetterFragment)
        }

        buttonC.setOnClickListener {
            addLetterFragment(thirdLetterFragment)
        }
    }
}