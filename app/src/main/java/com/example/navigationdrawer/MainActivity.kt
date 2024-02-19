package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val drawerLayout:DrawerLayout = findViewById(R.id.drawerlayout)
        val navView : NavigationView = findViewById(R.id.nav_view)
        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home->Toast.makeText(applicationContext,"Click Home",Toast.LENGTH_SHORT).show()
                R.id.nav_message->Toast.makeText(applicationContext,"Click Message",Toast.LENGTH_SHORT).show()
                R.id.nav_sync->Toast.makeText(applicationContext,"Click Sync",Toast.LENGTH_SHORT).show()
                R.id.nav_trash->Toast.makeText(applicationContext,"Click Delete",Toast.LENGTH_SHORT).show()
                R.id.nav_settings->Toast.makeText(applicationContext,"Click Settings",Toast.LENGTH_SHORT).show()
                R.id.nav_login->Toast.makeText(applicationContext,"Click Login",Toast.LENGTH_SHORT).show()
                R.id.nav_share->Toast.makeText(applicationContext,"Click Share",Toast.LENGTH_SHORT).show()
                R.id.nav_rate_us->Toast.makeText(applicationContext,"Click Rate us",Toast.LENGTH_SHORT).show()

            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}