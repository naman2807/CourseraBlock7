package com.example.courserablock7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    NumberPicker possibilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        possibilities = findViewById(R.id.picker);
        String[] possibilitiesString = {"Android", "Checklist text-input field", "Coursera","Supelec"};
        possibilities.setDisplayedValues(possibilitiesString);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesString.length - 1);
    }
}