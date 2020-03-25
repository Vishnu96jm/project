package com.project.android.assetsmanagement


import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.nav_main.*
import kotlinx.android.synthetic.main.view_asset.*
import kotlinx.android.synthetic.main.view_asset.drawer_layout

class HomeScreen : AppCompatActivity() {
    lateinit var toolbar: Toolbar
    lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_main)

        toolbar = nav_toolbar
        setSupportActionBar(toolbar)

       supportActionBar!!.setTitle("Asset Management")
        drawer = drawer_layout
        val navigationView  = navigation_main
        navigationView.setNavigationItemSelectedListener(object : NavigationView.OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when(item.itemId){
                    R.id.nav_dashboard ->{


                    }
                    R.id.nav_view_assets ->{
                        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,ViewAssets()).commit()

                    }
                    R.id.nav_add_assets ->{

                    }
                    R.id.nav_assigned_assets->{

                    }
                    R.id.nav_vendors ->{

                    }
                    R.id.nav_employees ->{

                    }
                    R.id.nav_view_profile ->{

                    }
                    R.id.nav_signout ->{

                    }
                }
                drawer.closeDrawer(GravityCompat.START)
                return true
            }
        })
        //animation effect on nav button
        val toggle = ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
//        var test = object :ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close){
//
//        }
        drawer.addDrawerListener(toggle)
        toggle.syncState()

    }

    override fun onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }
        else
            super.onBackPressed()
    }
}