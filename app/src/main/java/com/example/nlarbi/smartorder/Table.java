package com.example.nlarbi.smartorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.nlarbi.smartorder.Entity.Produit;
import com.example.nlarbi.smartorder.Entity.TableClient;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.util.ArrayList;
import java.util.HashMap;

import cz.msebera.android.httpclient.Header;

public class Table extends AppCompatActivity{

    ArrayList<HashMap<String, String>> tableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://10.0.2.2:8000/api/tableclient", new AsyncHttpResponseHandler() {
//192.168.174.220

            @Override
            public void onStart() {
                // called before request is started
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {

                ListView lv = (ListView) findViewById(R.id.listviewTable);

                TableClient[] t = new Gson().fromJson(new String(response), TableClient[].class);

                tableList = new ArrayList<>();
                for (int i = 0; i < t.length; i++) {
                    TableClient aT = t[i];
                    HashMap<String, String> table = new HashMap<>();

                    String id = Integer.toString(aT.getId());
                    String numero = Integer.toString(aT.getNumero());
                    String seats =  Integer.toString(aT.getSeats());
                    String status = Boolean.toString(aT.getStatus());

                    table.put("id", id);
                    table.put("numero", numero);
                    table.put("seats", seats);
                    table.put("statut", status);

                    tableList.add(table);
                }


                ListAdapter adapter = new SimpleAdapter(
                        Table.this, tableList,
                        R.layout.activity_table_item, new String[]{ "numero",
                        "seats", "statut"}, new int[]{
                        R.id.numero, R.id.seats, R.id.statut});

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

    public void openTable(View view) {
        Intent mintent = new Intent(Table.this, com.example.nlarbi.smartorder.TableClientScreen.class);
        startActivity(mintent);
    }
}
