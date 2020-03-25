package com.project.android.viewassets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.android.assetsmanagement.R
import kotlinx.android.synthetic.main.viewasset_item.view.*

class ViewAssetAdapter(private val viewassetList : List<ViewAssetItem>) : RecyclerView.Adapter<ViewAssetAdapter.ViewAssetViewHolder>() {
//    lateinit var mListener : OnItemClickListener
//
//    ON-ITEM-CLICK INTERFACE
//    interface OnItemClickListener{
//        fun onItemClick(position : Int)
//    }
//
//    fun setOnItemClickListener(listener : OnItemClickListener){
//        mListener = listener
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewAssetViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.viewasset_item,parent,false)
        return ViewAssetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewAssetViewHolder, position: Int) {
        val currentItem = viewassetList[position]

        holder.data1.text = currentItem.ivySerial
        holder.data2.text = currentItem.assetCategory
        holder.data3.text = currentItem.assetType
        holder.data4.text = currentItem.status

    }

    override fun getItemCount()= viewassetList.size

    class ViewAssetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val data1 = itemView.data_1
        val data2 = itemView.data_2
        val data3 = itemView.data_3
        val data4 = itemView.data_4

    }
}