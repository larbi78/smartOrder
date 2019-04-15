package com.example.nlarbi.smartorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Stats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
    }

    public void buttonClickStock(View view) {
        Intent mintent = new Intent(com.example.nlarbi.smartorder.Stats.this, com.example.nlarbi.smartorder.Stock.class);
        startActivity(mintent);
    }

    public void buttonClickConso(View view) {
        Intent mintent = new Intent(com.example.nlarbi.smartorder.Stats.this, com.example.nlarbi.smartorder.Conso.class);
        startActivity(mintent);
    }

    public void buttonClickTurnover(View view) {
        Intent mintent = new Intent(com.example.nlarbi.smartorder.Stats.this, com.example.nlarbi.smartorder.Turnover.class);
        startActivity(mintent);
    }
}
