package com.rahim.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertNow(View view) {
        EditText editText=findViewById(R.id.userData);
        TextView textView=findViewById(R.id.displayText);
        String taka = editText.getText().toString();
        Double takaToDouble = Double.parseDouble(taka);
        Double usd=takaToDouble*0.011;
        String dollerInString= String.valueOf(usd);
        textView.setText(dollerInString);

    }
}