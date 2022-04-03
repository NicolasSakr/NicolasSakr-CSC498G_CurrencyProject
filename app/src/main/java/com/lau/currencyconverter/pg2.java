package com.lau.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pg2 extends AppCompatActivity {

    private TextView lb;
    private TextView us;
    private TextView rt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg2);

        lb = (TextView) findViewById(R.id.amountLBP);
        us = (TextView) findViewById(R.id.amountUSD);
        rt = (TextView) findViewById(R.id.Rate);

        Intent x = getIntent();
        String lbp = x.getStringExtra("lbp");
        lb.setText(lbp + " LBP");
        String usd = x.getStringExtra("usd");
        us.setText(usd + " $");
        String rate = x.getStringExtra("rate");
        rt.setText("1$ = "+rate);


    }

    public void back(View v){
        //onclick go back to the main page to input new values
        Intent obj = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(obj);
    }
}