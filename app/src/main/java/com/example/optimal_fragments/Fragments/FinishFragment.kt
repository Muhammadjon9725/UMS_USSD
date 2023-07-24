package com.example.optimal_fragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.optimal_fragments.R
import com.example.optimal_fragments.databinding.FragmentFinishBinding
import com.example.ums_navigation.Adapters.Adapters
import com.example.ums_navigation.Models.Tarifmodels

class FinishFragment : Fragment() {
    private val binding by lazy { FragmentFinishBinding.inflate(layoutInflater) }
    lateinit var adapters: Tarifmodels
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        adapters = arguments?.getSerializable( "keyuser") as Tarifmodels
        binding.name.text = adapters.name
        binding.info.text = adapters.info
        binding.code.text = adapters.code

        return binding.root
    }
}