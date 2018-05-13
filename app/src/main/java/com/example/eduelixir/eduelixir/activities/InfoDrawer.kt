package com.example.eduelixir.eduelixir.activities

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.eduelixir.eduelixir.DrawerItems.*
import com.example.eduelixir.eduelixir.R
import kotlinx.android.synthetic.main.activity_info_drawer.*
import kotlinx.android.synthetic.main.app_bar_info_drawer.*

class InfoDrawer : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_drawer)
        setSupportActionBar(toolbar)


        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        displayScreen(-1)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.info_drawer, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        displayScreen(item.itemId)
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun displayScreen(id: Int) {

        var fragment = when (id) {

            R.id.nav_dashboard -> {
                DashBoardFragment()
            }

            R.id.nav_attendance -> {
                AttendanceFragment()
            }

            R.id.nav_examination -> {
                ExaminationFragment()
            }
            R.id.nav_fees -> {
                FeesFragment()
            }
            R.id.nav_results -> {
                ResultsFragment()
            }
            R.id.nav_timeTable -> {
                TimeTableFragment()
            }
            else -> {
                DashBoardFragment()
            }
        }

        supportFragmentManager.beginTransaction().replace(R.id.relativeLayout,fragment).commit()
    }
}