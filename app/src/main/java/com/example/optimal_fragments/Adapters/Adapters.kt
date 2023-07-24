package com.example.ums_navigation.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.optimal_fragments.databinding.ItemtarifBinding
import com.example.ums_navigation.Models.Tarifmodels

class Adapters(val list: ArrayList<Tarifmodels>, var rvAction:RvAction): RecyclerView.Adapter<Adapters.VH>() {

    inner class VH(val itemtarifBinding: ItemtarifBinding):RecyclerView.ViewHolder(itemtarifBinding.root){
        fun onBind(tarifmodels: Tarifmodels){
            itemtarifBinding.name.text = tarifmodels.name
            itemtarifBinding.info.text = tarifmodels.info
            itemtarifBinding.code.text = tarifmodels.code
            itemtarifBinding.root.setOnClickListener{
                rvAction.click(position)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            return VH(ItemtarifBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun getItemCount(): Int = list.size
    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }
    interface RvAction{
        fun click(position: Int)
    }
}