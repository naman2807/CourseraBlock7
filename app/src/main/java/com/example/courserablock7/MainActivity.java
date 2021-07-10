package com.example.courserablock7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    NumberPicker possibilities;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        possibilities = findViewById(R.id.picker);
        webView = findViewById(R.id.web);
        String[] possibilitiesString = {"Android", "Checklist text-input field", "Coursera","Supelec"};
        possibilities.setDisplayedValues(possibilitiesString);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesString.length - 1);
    }

    public void navigate(View v){
        int choice = possibilities.getValue();
        if(choice == 0)
            webView.loadUrl("file:///android_asset/android.html");
    }
}