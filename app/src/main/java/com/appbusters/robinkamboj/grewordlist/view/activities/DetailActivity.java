package com.appbusters.robinkamboj.grewordlist.view.activities;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.appbusters.robinkamboj.grewordlist.R;

public class DetailActivity extends AppCompatActivity {

    private TextView word, meaing, example;
    private String iWord, iMeaning, iExample;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //noinspection ConstantConditions
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        word = (TextView) findViewById(R.id.word);
        meaing = (TextView) findViewById(R.id.meaning);
        example = (TextView) findViewById(R.id.example);

        setValues();
    }

    private void setValues(){
        iWord = getIntent().getStringExtra("word");
        iMeaning = getIntent().getStringExtra("meaning");
        iExample = getIntent().getStringExtra("example");

        word.setText(iWord);
        meaing.setText(iMeaning);
        example.setText(iExample);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //nonspection SimplifiableIfStatement
        //noinspection StatementWithEmptyBody
        switch (id){
        }

        return super.onOptionsItemSelected(item);
    }
}
