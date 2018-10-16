package com.project.taewon.samplekotlin.view.activity

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.project.taewon.samplekotlin.R
import com.project.taewon.samplekotlin.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityHomeBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_home)
        drawerLayout = binding.drawerLayout

        val navController = Navigation.findNavController(this, R.id.home_navigation_fragment)

        // Set up ActionBar
        setSupportActionBar(binding.toolbar)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)

        binding.navigationView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(drawerLayout,
                Navigation.findNavController(this, R.id.home_navigation_fragment))
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
