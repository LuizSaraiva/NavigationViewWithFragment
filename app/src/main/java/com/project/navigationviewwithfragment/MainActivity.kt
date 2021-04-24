package com.project.navigationviewwithfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_main)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.item_file ->{}
            R.id.item_shared ->{}
            R.id.item_starred ->{}
            R.id.item_recent ->{}
            R.id.item_offline ->{}
            R.id.item_upload ->{}
            R.id.item_backup ->{}
        }
        return true
    }
}