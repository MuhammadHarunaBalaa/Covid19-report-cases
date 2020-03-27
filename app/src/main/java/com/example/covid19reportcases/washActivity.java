package com.example.covid19reportcases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class washActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wash);


        webView= findViewById(R.id.washweb);
         webView.loadUrl("https://www.youtube.com/watch?v=seA1wbXUQTs");
    }
}
