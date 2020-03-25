package com.project.android.assetsmanagement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.android.viewassets.Supplier
import com.project.android.viewassets.ViewAssetAdapter
import kotlinx.android.synthetic.main.nav_main.*
import kotlinx.android.synthetic.main.view_asset.*
import kotlinx.android.synthetic.main.view_asset.drawer_layout

class ViewAssets : Fragment() {
    lateinit var toolbar : Toolbar
    lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.view_asset,container,false)
        view_asset_recycler_view.adapter = ViewAssetAdapter(Supplier.data)
        view_asset_recycler_view.layoutManager = LinearLayoutManager(activity)

         toolbar = nav_toolbar
        //casting activity
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        //supportActionBar!!.setTitle("Assets")
        (activity as AppCompatActivity).supportActionBar?.title = "View Assets"
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//
//        toolbar = view_asset_toolbar
//        activity.setActionBar(toolbar)
//
//        // supportActionBar!!.setTitle("nav Assets")
//        return super.onActivityCreated(savedInstanceState)
//    }

}