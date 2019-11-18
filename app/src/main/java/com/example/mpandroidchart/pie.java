package com.example.mpandroidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class pie extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);
        PieChart pieChart = findViewById(R.id.piechart);
        ArrayList pieShape = new ArrayList();

        pieShape.add(new Entry(9f, 0));
        pieShape.add(new Entry(10f, 1));
        pieShape.add(new Entry(11f, 2));
        pieShape.add(new Entry(12f, 3));
        pieShape.add(new Entry(13f, 4));
        pieShape.add(new Entry(14f, 5));
        pieShape.add(new Entry(15f, 6));

        PieDataSet dataSet = new PieDataSet(pieShape, "Cells");

        ArrayList year = new ArrayList();

        year.add("2008");
        year.add("2009");
        year.add("2010");
        year.add("2011");
        year.add("2012");
        year.add("2013");
        year.add("2014");
        PieData data = new PieData(year, dataSet);
        pieChart.setData(data);
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        pieChart.animateXY(5000, 5000);

    }
}




