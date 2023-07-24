package com.example.optimal_fragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.optimal_fragments.Adapters.Cashe
import com.example.optimal_fragments.R
import com.example.optimal_fragments.databinding.FragmentHomeBinding
import com.example.ums_navigation.Adapters.Adapters
import com.example.ums_navigation.Models.Tarifmodels

class HomeFragment : Fragment() {


    lateinit var adapters: Adapters
    var list = ArrayList<Tarifmodels>()
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var count = 0
        list = ArrayList()
        binding.apply {
            val navOptions = NavOptions.Builder()
            cardTarif.setOnClickListener {
                Cashe.count =0
                navOptions.setEnterAnim(R.anim.exit_anim)
                navOptions.setExitAnim(R.anim.pop_enter_anim)
                navOptions.setPopEnterAnim(R.anim.enter_anim)
                navOptions.setPopExitAnim(R.anim.pop_exit_anim)
                findNavController().navigate(R.id.listFragment, bundleOf("keyuser" to 0), navOptions.build())

            }
            cardDaqiqa.setOnClickListener {
                Cashe.count = 1
                navOptions.setEnterAnim(R.anim.exit_anim)
                navOptions.setExitAnim(R.anim.pop_enter_anim)
                navOptions.setPopEnterAnim(R.anim.enter_anim)
                navOptions.setPopExitAnim(R.anim.pop_exit_anim)
                findNavController().navigate(R.id.listFragment, bundleOf("keyuser" to 1), navOptions.build())
            }
            cardInternet.setOnClickListener {
                Cashe.count = 2
                navOptions.setEnterAnim(R.anim.exit_anim)
                navOptions.setExitAnim(R.anim.pop_enter_anim)
                navOptions.setPopEnterAnim(R.anim.enter_anim)
                navOptions.setPopExitAnim(R.anim.pop_exit_anim)
                findNavController().navigate(R.id.listFragment, bundleOf("keyuser" to 2), navOptions.build())
            }
            cardServise.setOnClickListener {
                Cashe.count = 3
                navOptions.setEnterAnim(R.anim.exit_anim)
                navOptions.setExitAnim(R.anim.pop_enter_anim)
                navOptions.setPopEnterAnim(R.anim.enter_anim)
                navOptions.setPopExitAnim(R.anim.pop_exit_anim)
                findNavController().navigate(R.id.listFragment, bundleOf("keyuser" to 3), navOptions.build())
            }
            cardSms.setOnClickListener {
                Cashe.count = 4
                navOptions.setEnterAnim(R.anim.exit_anim)
                navOptions.setExitAnim(R.anim.pop_enter_anim)
                navOptions.setPopEnterAnim(R.anim.enter_anim)
                navOptions.setPopExitAnim(R.anim.pop_exit_anim)
                findNavController().navigate(R.id.listFragment, bundleOf("keyuser" to 4), navOptions.build())
            }
            cardNews.setOnClickListener {
                Cashe.count = 5
                navOptions.setEnterAnim(R.anim.exit_anim)
                navOptions.setExitAnim(R.anim.pop_enter_anim)
                navOptions.setPopEnterAnim(R.anim.enter_anim)
                navOptions.setPopExitAnim(R.anim.pop_exit_anim)
                findNavController().navigate(R.id.listFragment, bundleOf("keyuser" to 5), navOptions.build())
            }
        }
        return binding.root
    }
}