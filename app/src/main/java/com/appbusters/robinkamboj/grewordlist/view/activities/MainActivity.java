package com.appbusters.robinkamboj.grewordlist.view.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.view.fragments.FlashCardsFragment;
import com.appbusters.robinkamboj.grewordlist.view.fragments.WMListFragment;
import com.appbusters.robinkamboj.grewordlist.view.fragments.WOTDFragment;
import com.appbusters.robinkamboj.grewordlist.view.fragments.YourBookmarksFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        addWMListFragment(100);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        switch (id){
//            case R.id.action_sort:{
//
//                break;
//            }
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){
            case R.id.your_bookmarks:{
                addBookmarksFragment();
                break;
            }
            case R.id.word_of_the_day:{
                addWOTDFragment();
                break;
            }
            case R.id.flash_cards:{
                addFlashCardsFragment();
                break;
            }
            case R.id.group1:{
                addWMListFragment(100);
                break;
            }
            case R.id.group2:{
                addWMListFragment(101);
                break;
            }
            case R.id.group3:{
                addWMListFragment(102);
                break;
            }
            case R.id.group4:{
                addWMListFragment(103);
                break;
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void addWMListFragment(int displayCode){
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        WMListFragment wmListFragment = new WMListFragment();
        Bundle args = new Bundle();
        args.putInt("displayCode", displayCode);
        wmListFragment.setArguments(args);
        fragmentTransaction.replace(R.id.fragment_container, wmListFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void addWOTDFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        WOTDFragment wotdFragment = new WOTDFragment();
        fragmentTransaction.replace(R.id.fragment_container, wotdFragment);
        fragmentTransaction.commit();
    }

    private void addFlashCardsFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        FlashCardsFragment flashCardsFragment = new FlashCardsFragment();
        fragmentTransaction.replace(R.id.fragment_container, flashCardsFragment);
        fragmentTransaction.commit();
    }

    private void addBookmarksFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        YourBookmarksFragment yourBookmarksFragment = new YourBookmarksFragment();
        fragmentTransaction.replace(R.id.fragment_container, yourBookmarksFragment);
        fragmentTransaction.commit();
    }
}
