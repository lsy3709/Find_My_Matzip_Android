package com.example.find_my_matzip.navTab.navTabFragment.homeFragChildFrags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.find_my_matzip.databinding.FragmentChildHome3Binding

class ChildHomeFragment3 : Fragment() {
    lateinit var binding : FragmentChildHome3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentChildHome3Binding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChildHome3Binding.inflate(layoutInflater,container,false)
        return binding.root
    }


}