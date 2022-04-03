package com.lau.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView res;
    EditText amountInLBP;
    EditText amountInUSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amountInLBP= (EditText) findViewById(R.id.amountLBP);
        amountInUSD= (EditText) findViewById(R.id.amountUSD);
        res = (TextView) findViewById(R.id.result);

    }


    public void convert(View view){
        String strLBP= amountInLBP.getText().toString();
        String strUSD= amountInUSD.getText().toString();

        if(strLBP!=null && strUSD.isEmpty()){

            //If the user inputs the amouunt in LBP, the api will fetch the rate, and calculate the amount in usd
            //assigning the rate from lirarate API
            double rate = 78;
            //converting the amount given in LBP to USD
            double lbp2usd= Double.parseDouble(strLBP)/rate;
            //Send value to the databse

            //KHOURY: add the values to the databse using POST API




        }else if(strUSD!=null && strLBP.isEmpty()){
            //If the user inputs the amount in USD, the api will fetch the rate, and calculate the amount in lbp
            //assigning the rate from lirarate API
            double rate = 78;
            //converting the amount given in USD to LBP
            double usd2lbp= Double.parseDouble(strUSD)*rate;
            //Send value to the databse

            //KHOURY: add the values to the databse using POST API


        }else if(strUSD!=null && strLBP!=null){
            //if the user enters a value in both USD adn LBP, it will show an error and he will try again
            res.setText("ERROR, Try filling one input ONLY.");
            Toast.makeText(getApplicationContext(), "Error, Try filling one input ONLY.", Toast.LENGTH_LONG).show();
        }else{
            //if the user enters a value in both USD adn LBP, it will show an error and he will try again
            res.setText("ERROR, Fill one input.");
            Toast.makeText(getApplicationContext(), "Error, Fill one Input!", Toast.LENGTH_LONG).show();
        }
    }

}