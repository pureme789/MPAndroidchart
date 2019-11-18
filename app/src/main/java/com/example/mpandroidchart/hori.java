package com.example.mpandroidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class hori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hori);
        HorizontalBarChart chart = (HorizontalBarChart) findViewById(R.id.bar_chart);
        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(8, 0));
        entries.add(new BarEntry(2, 1));
        entries.add(new BarEntry(5, 2));
        entries.add(new BarEntry(20, 3));
        entries.add(new BarEntry(15, 4));
        entries.add(new BarEntry(19, 5));
        entries.add(new BarEntry(16, 6));

        BarDataSet bardataset = new BarDataSet(entries, "Cells");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("2016");
        labels.add("2015");
        labels.add("2014");
        labels.add("2013");
        labels.add("2012");
        labels.add("2011");
        labels.add("2017");

        BarData data = new BarData(labels, bardataset);
        chart.setData(data); // set the data and list of labels into chart
        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        bardataset.setValueTextSize(20);
        chart.animateY(5000);



    }
}
