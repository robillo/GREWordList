package com.appbusters.robinkamboj.grewordlist.view.activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.view.fragments.FlashCardsFragment;
import com.appbusters.robinkamboj.grewordlist.view.fragments.WMListFragment;
import com.appbusters.robinkamboj.grewordlist.view.fragments.WOTDFragment;
import com.appbusters.robinkamboj.grewordlist.view.fragments.YourBookmarksFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FragmentTransaction fragmentTransaction;
    private int fNumber = 0;   //fragment number
    private CharSequence[] items = {"Letter A", "Letter B", "Letter C", "Letter D", "Letter E",
            "Letter F", "Letter G", "Letter H", "Letter I", "Letter J", "Letter K", "Letter L",
            "Letter M", "Letter N", "Letter O", "Letter P", "Letter Q", "Letter R", "Letter S",
            "Letter T", "Letter U", "Letter V", "Letter W", "Letter X", "Letter Y", "Letter Z"};

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

        Log.e("SET FRAGMENT CALLED", "CALLED");
        setFragment();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        Log.e("BEFORE", "SET_FRAGMENT");
//        setFragment();
//        Log.e("AFTER", "SET_FRAGMENT");
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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("fNumber", fNumber);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        fNumber = savedInstanceState.getInt("fNumber");
        Log.e("FRAGMENT NUMBER", " " + fNumber);
        setFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.action_sort:{
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Choose Sorting Option:")
                        .setItems(items, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                switch (which){
                                    case 0:{
                                        addWMListFragment(0);

                                        break;
                                    }
                                    case 1:{
                                        addWMListFragment(1);

                                        break;
                                    }
                                    case 2:{
                                        addWMListFragment(2);

                                        break;
                                    }
                                    case 3:{
                                        addWMListFragment(3);

                                        break;
                                    }
                                    case 4:{
                                        addWMListFragment(4);

                                        break;
                                    }
                                    case 5:{
                                        addWMListFragment(5);

                                        break;
                                    }
                                    case 6:{
                                        addWMListFragment(6);

                                        break;
                                    }
                                    case 7:{
                                        addWMListFragment(7);

                                        break;
                                    }
                                    case 8:{
                                        addWMListFragment(8);

                                        break;
                                    }
                                    case 9:{
                                        addWMListFragment(9);

                                        break;
                                    }
                                    case 10:{
                                        addWMListFragment(10);

                                        break;
                                    }
                                    case 11:{
                                        addWMListFragment(11);

                                        break;
                                    }
                                    case 12:{
                                        addWMListFragment(12);

                                        break;
                                    }
                                    case 13:{
                                        addWMListFragment(13);

                                        break;
                                    }
                                    case 14:{
                                        addWMListFragment(14);

                                        break;
                                    }
                                    case 15:{
                                        addWMListFragment(15);

                                        break;
                                    }
                                    case 16:{
                                        addWMListFragment(16);

                                        break;
                                    }
                                    case 17:{
                                        addWMListFragment(17);

                                        break;
                                    }
                                    case 18:{
                                        addWMListFragment(18);

                                        break;
                                    }
                                    case 19:{
                                        addWMListFragment(19);

                                        break;
                                    }
                                    case 20:{
                                        addWMListFragment(20);

                                        break;
                                    }
                                    case 21:{
                                        addWMListFragment(21);

                                        break;
                                    }
                                    case 22:{
                                        addWMListFragment(22);

                                        break;
                                    }
                                    case 23:{
//                                        addWMListFragment(23);
//
                                        Toast.makeText(MainActivity.this, "No Words for letter X", Toast.LENGTH_SHORT).show();
                                        break;
                                    }
                                    case 24:{
//                                        addWMListFragment(24);
//
                                        Toast.makeText(MainActivity.this, "No Words for letter Y", Toast.LENGTH_SHORT).show();
                                        break;
                                    }
                                    case 25:{
                                        addWMListFragment(25);

                                        break;
                                    }

                                }
                            }
                        }).show();
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }

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
        switch (displayCode){
            case 100:{
                fNumber = 3;
                break;
            }
            case 101:{
                fNumber = 4;
                break;
            }
            case 102:{
                fNumber = 5;
                break;
            }
            case 103:{
                fNumber = 6;
                break;
            }
            case 0:{            //A
                fNumber = 7;
                break;
            }
            case 1:{            //B
                fNumber = 8;
                break;
            }
            case 2:{            //C
                fNumber = 9;
                break;
            }
            case 3:{            //D
                fNumber = 10;
                break;
            }
            case 4:{            //E
                fNumber = 11;
                break;
            }
            case 5:{            //F
                fNumber = 12;
                break;
            }
            case 6:{            //G
                fNumber = 13;
                break;
            }
            case 7:{            //H
                fNumber = 14;
                break;
            }
            case 8:{            //I
                fNumber = 15;
                break;
            }
            case 9:{            //J
                fNumber = 16;
                break;
            }
            case 10:{            //K
                fNumber = 17;
                break;
            }
            case 11:{            //L
                fNumber = 18;
                break;
            }
            case 12:{            //M
                fNumber = 19;
                break;
            }
            case 13:{            //N
                fNumber = 20;
                break;
            }
            case 14:{            //0
                fNumber = 21;
                break;
            }
            case 15:{            //P
                fNumber = 22;
                break;
            }
            case 16:{            //Q
                fNumber = 23;
                break;
            }
            case 17:{            //R
                fNumber = 24;
                break;
            }
            case 18:{            //S
                fNumber = 25;
                break;
            }
            case 19:{            //T
                fNumber = 26;
                break;
            }
            case 20:{            //U
                fNumber = 27;
                break;
            }
            case 21:{            //V
                fNumber = 28;
                break;
            }
            case 22:{            //W
                fNumber = 29;
                break;
            }
            case 23:{            //X
                fNumber = 30;
                break;
            }
            case 24:{            //Y
                fNumber = 31;
                break;
            }
            case 25:{            //Z
                fNumber = 32;
                break;
            }
        }
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
        fNumber = 1;
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        WOTDFragment wotdFragment = new WOTDFragment();
        fragmentTransaction.replace(R.id.fragment_container, wotdFragment);
        fragmentTransaction.commit();
    }

    private void addFlashCardsFragment(){
        fNumber = 2;
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        FlashCardsFragment flashCardsFragment = new FlashCardsFragment();
        fragmentTransaction.replace(R.id.fragment_container, flashCardsFragment);
        fragmentTransaction.commit();
    }

    private void addBookmarksFragment(){
        fNumber = 0;
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        YourBookmarksFragment yourBookmarksFragment = new YourBookmarksFragment();
        fragmentTransaction.replace(R.id.fragment_container, yourBookmarksFragment);
        fragmentTransaction.commit();
    }

    private void setFragment(){
        switch (fNumber){
            case 0:{
                addBookmarksFragment();
                break;
            }
            case 1:{
                addWOTDFragment();
                break;
            }
            case 2:{
                addFlashCardsFragment();
                break;
            }
            case 3:{
                addWMListFragment(100);
                break;
            }
            case 4:{
                addWMListFragment(101);
                break;
            }
            case 5:{
                addWMListFragment(102);
                break;
            }
            case 6:{
                addWMListFragment(103);
                break;
            }
            case 7:{
                addWMListFragment(0);
                break;
            }
            case 8:{
                addWMListFragment(1);
                break;
            }
            case 9:{
                addWMListFragment(2);
                break;
            }
            case 10:{
                addWMListFragment(3);
                break;
            }
            case 11:{
                addWMListFragment(4);
                break;
            }
            case 12:{
                addWMListFragment(5);
                break;
            }
            case 13:{
                addWMListFragment(6);
                break;
            }
            case 14:{
                addWMListFragment(7);
                break;
            }
            case 15:{
                addWMListFragment(8);
                break;
            }
            case 16:{
                addWMListFragment(9);
                break;
            }
            case 17:{
                addWMListFragment(10);
                break;
            }
            case 18:{
                addWMListFragment(11);
                break;
            }
            case 19:{
                addWMListFragment(12);
                break;
            }
            case 20:{
                addWMListFragment(13);
                break;
            }
            case 21:{
                addWMListFragment(14);
                break;
            }
            case 22:{
                addWMListFragment(15);
                break;
            }
            case 23:{
                addWMListFragment(16);
                break;
            }
            case 24:{
                addWMListFragment(17);
                break;
            }
            case 25:{
                addWMListFragment(18);
                break;
            }
            case 26:{
                addWMListFragment(19);
                break;
            }
            case 27:{
                addWMListFragment(20);
                break;
            }
            case 28:{
                addWMListFragment(21);
                break;
            }
            case 29:{
                addWMListFragment(22);
                break;
            }
            case 30:{
                addWMListFragment(23);
                break;
            }
            case 31:{
                addWMListFragment(24);
                break;
            }
            case 32:{
                addWMListFragment(25);
                break;
            }
        }
        Log.e("DURING", "SET_FRAGMENT");
    }
}
