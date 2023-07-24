package com.example.optimal_fragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.optimal_fragments.Adapters.Cashe
import com.example.optimal_fragments.R
import com.example.optimal_fragments.databinding.FragmentListBinding
import com.example.ums_navigation.Adapters.Adapters
import com.example.ums_navigation.Models.Tarifmodels


class ListFragment : Fragment(){

    lateinit var adapters: Adapters
    var list = ArrayList<Tarifmodels>()
    var count = Cashe.count
    private val binding by lazy { FragmentListBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        list = ArrayList()
//



        binding.apply {
            adapters = Adapters(list,object :Adapters.RvAction{
                override fun click(position: Int) {
                    findNavController().navigate(R.id.finishFragment2, bundleOf("keyuser" to list[position]))
                }
            })

            recy.adapter =adapters
            when(count){
                0->{

                    list.add(Tarifmodels("Mobi 20","*111*20#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("Mobi 30","*111*30#","30 000/1500 soʻm oylik/\\nkunlik abonent toʻlovi 600/17 " ))
                    list.add(Tarifmodels("Mobi 45","*111*45#","45 000/2000 soʻm oylik/\\nkunlik abonent toʻlovi 700/21 " ))
                    list.add(Tarifmodels("Mobi 60","*111*60#","60 000/2100 soʻm oylik/\\nkunlik abonent toʻlovi 650/9 " ))
                    list.add(Tarifmodels("Mobi 75","*111*75#","75 000/2750 soʻm oylik/\\nkunlik abonent toʻlovi 890/19 " ))
                    list.add(Tarifmodels("Mobi 90","*111*90#","90 000/3000 soʻm oylik/\\nkunlik abonent toʻlovi 740/11 " ))
                }
                1->{

                    list.add(Tarifmodels("Daqiqa 100","*120*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("Daqiqa 100","*120*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("Daqiqa 100","*120*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("Daqiqa 100","*120*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("Daqiqa 100","*120*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("Daqiqa 100","*120*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("Daqiqa 100","*120*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))}
                2->{
                    list.add(Tarifmodels("MB 1 GB","*150*1#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 3 BG","*150*3#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 5 GB","*150*5#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 8 GB","*150*8#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 10 GB","*150*10#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 15 GB","*150*15#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 25 GB","*150*25#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 50 GB","*150*50#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 100 GB","*150*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB Cheksiz","*150*150#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                }
                3->{
                    fun service(){
                    list.add(Tarifmodels("MB 1 GB","*150*1#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 3 BG","*150*3#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 5 GB","*150*5#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 8 GB","*150*8#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 10 GB","*150*10#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 15 GB","*150*15#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 25 GB","*150*25#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 50 GB","*150*50#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 100 GB","*150*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB Cheksiz","*150*150#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    }
                }
                4->{
                    list.add(Tarifmodels("SMS 100","*120*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("SMS 300","*120*300#","30 000/1500 soʻm oylik/\\nkunlik abonent toʻlovi 600/17 " ))
                    list.add(Tarifmodels("SMS 500","*120*500#","45 000/2000 soʻm oylik/\\nkunlik abonent toʻlovi 700/21 " ))
                    list.add(Tarifmodels("SMS 1000","*120*1000#","60 000/2100 soʻm oylik/\\nkunlik abonent toʻlovi 650/9 " ))
                    list.add(Tarifmodels("SMS 1500","*120*1500#","75 000/2750 soʻm oylik/\\nkunlik abonent toʻlovi 890/19 " ))
                    list.add(Tarifmodels("SMS 3000","*120*3000#","90 000/3000 soʻm oylik/\\nkunlik abonent toʻlovi 740/11 " ))
                }
                5->{
                    list.add(Tarifmodels("MB 1 GB","*150*1#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 3 BG","*150*3#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 5 GB","*150*5#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 8 GB","*150*8#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 10 GB","*150*10#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 15 GB","*150*15#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 25 GB","*150*25#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 50 GB","*150*50#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB 100 GB","*150*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
                    list.add(Tarifmodels("MB Cheksiz","*150*150#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))

                }
            }
        }

        return binding.root
    }


}