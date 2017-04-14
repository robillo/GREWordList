package com.appbusters.robinkamboj.grewordlist.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;

import com.appbusters.robinkamboj.grewordlist.R;

public class DetailActivity extends AppCompatActivity {

    private TextView word, meaning, example;
    private String iWord, iMeaning, iExample;
    private SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //noinspection ConstantConditions
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        seekBar = (SeekBar) findViewById(R.id.seekbar);
        word = (TextView) findViewById(R.id.word);
        meaning = (TextView) findViewById(R.id.meaning);
        example = (TextView) findViewById(R.id.example);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int position, boolean b) {
                word.setTextSize(position);
                meaning.setTextSize(position);
                example.setTextSize(position);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        setValues();
    }

    private void setValues(){
        iWord = getIntent().getStringExtra("word");
        iMeaning = getIntent().getStringExtra("meaning");
        iExample = getIntent().getStringExtra("example");

        word.setText(iWord);
        meaning.setText(iMeaning);
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
