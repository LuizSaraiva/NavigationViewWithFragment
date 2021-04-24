package com.project.navigationviewwithfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var toolbar: Toolbar

    lateinit var myFileFragment: MyFileFragment
    lateinit var sharedFragment: SharedFragment
    lateinit var starredFragment: StarredFragment
    lateinit var recentFragment: RecentFragment
    lateinit var offlineFragment: OfflineFragment
    lateinit var uploadsFragment: UploadsFragment
    lateinit var backupsFragment: BackupsFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_main)

        iniComponents()
        navigationView.setNavigationItemSelectedListener(this)

        setSupportActionBar(toolbar)
        toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.openDrawer,
            R.string.closeDrawer
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        myFileFragment = MyFileFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_fragment, myFileFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }

    private fun iniComponents() {
        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.nav)
        toolbar = findViewById(R.id.toolbar)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.item_file -> {
                myFileFragment = MyFileFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_fragment, myFileFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.item_shared -> {
                sharedFragment = SharedFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_fragment, sharedFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.item_starred -> {
                starredFragment = StarredFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_fragment, starredFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.item_recent -> {
                recentFragment = RecentFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_fragment, recentFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.item_offline -> {
                offlineFragment = OfflineFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_fragment, offlineFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.item_upload -> {
                uploadsFragment = UploadsFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_fragment, uploadsFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.item_backup -> {
                backupsFragment = BackupsFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_fragment, backupsFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}