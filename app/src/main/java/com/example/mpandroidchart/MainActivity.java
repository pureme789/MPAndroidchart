package com.example.mpandroidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickNext(View view) {
        Button button4 = (Button) findViewById(R.id.button4);
        Intent intent = new Intent(MainActivity.this, bar.class);
        startActivity(intent);
    }

    public void onClickGo(View view) {
        Button button3 = (Button) findViewById(R.id.button3);
        Intent intent = new Intent(MainActivity.this, hori.class);
        startActivity(intent);
    }

    public void onClickGoback(View view) {
        Button btnPieChart = (Button) findViewById(R.id.btnPieChart);
        Intent intent = new Intent(MainActivity.this, pie.class);
        startActivity(intent);
    }

}