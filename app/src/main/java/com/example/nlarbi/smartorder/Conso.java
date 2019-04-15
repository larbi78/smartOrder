package com.example.nlarbi.smartorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Conso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conso);
    }

    public void buttonClickEntree(View view) {
        Intent mintent = new Intent(com.example.nlarbi.smartorder.Conso.this, com.example.nlarbi.smartorder.Stock.class);
        startActivity(mintent);
    }

    public void buttonClickPlat(View view) {
        Intent mintent = new Intent(com.example.nlarbi.smartorder.Conso.this, com.example.nlarbi.smartorder.Stock.class);
        startActivity(mintent);
    }

    public void buttonClickDessert(View view) {
        Intent mintent = new Intent(com.example.nlarbi.smartorder.Conso.this, com.example.nlarbi.smartorder.Stock.class);
        startActivity(mintent);
    }

    public void buttonClickBoissons(View view) {
        Intent mintent = new Intent(com.example.nlarbi.smartorder.Conso.this, com.example.nlarbi.smartorder.Stock.class);
        startActivity(mintent);
    }
}
