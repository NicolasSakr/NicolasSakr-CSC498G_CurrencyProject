package com.lau.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

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

            double lbp2usd= Double.parseDouble(strLBP)/rate;


        }else if(strUSD!=null && strLBP.isEmpty()){

            double usd2lbp= Double.parseDouble(strUSD)*rate;


        }else if(strUSD!=null && strLBP!=null){
            res.setText("ERROR, Try filling one input ONLY.");
            Toast.makeText(getApplicationContext(), "Error, Try filling one input ONLY.", Toast.LENGTH_LONG).show();
        }else{
            res.setText("ERROR, Fill one input.");
            Toast.makeText(getApplicationContext(), "Error, Fill one Input!", Toast.LENGTH_LONG).show();
        }
    }

}