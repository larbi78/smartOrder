package com.example.nlarbi.smartorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
//import com.loopj.android.http.AsyncHttpClient;
//import com.loopj.android.http.AsyncHttpResponseHandler;
//
//import cz.msebera.android.httpclient.Header;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void buttonClick(View view) {
        Intent mintent = new Intent(MainScreen.this, com.example.nlarbi.smartorder.Table.class);
        startActivity(mintent);
    }

    public void buttonClickMenu(View view) {
        Intent mintent = new Intent(MainScreen.this, com.example.nlarbi.smartorder.Menu.class);
        startActivity(mintent);
    }

    public void buttonClickStats(View view) {
        Intent mintent = new Intent(MainScreen.this, com.example.nlarbi.smartorder.Stats.class);
        startActivity(mintent);
    }
}