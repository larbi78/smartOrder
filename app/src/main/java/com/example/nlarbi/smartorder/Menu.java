package com.example.nlarbi.smartorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.nlarbi.smartorder.Entity.Produit;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.*;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import cz.msebera.android.httpclient.Header;

public class Menu extends AppCompatActivity {

    ArrayList<HashMap<String, String>> produitList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://10.0.2.2:8000/api/produits", new AsyncHttpResponseHandler() {
//192.168.174.220

            @Override
            public void onStart() {
                // called before request is started
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {

                ListView lv = (ListView) findViewById(R.id.listview);

                Produit[] p = new Gson().fromJson(new String(response), Produit[].class);

                produitList = new ArrayList<>();
                for (int i = 0; i < p.length; i++) {
                    Produit aP = p[i];
                    HashMap<String, String> produit = new HashMap<>();

                    String name = aP.getName();
                    String status = aP.getStatus();
                    String price =  Float.toString(aP.getPrice());
                    String type = aP.getType();

                    produit.put("name", name);
                    produit.put("status", status);
                    produit.put("price", price);
                    produit.put("type", type);

                    produitList.add(produit);
                }
                Log.e("STATUS", produitList.toString());


                ListAdapter adapter = new SimpleAdapter(
                        Menu.this, produitList,
                        R.layout.activity_menu_item, new String[]{"status", "name",
                        "type", "price"}, new int[]{R.id.status,
                        R.id.name, R.id.type, R.id.price});

                lv.setAdapter(adapter);

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
            }

            @Override
            public void onRetry(int retryNo) {
                // called when request is retried
            }

        });
    }


}
