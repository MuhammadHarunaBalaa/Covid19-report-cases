package com.example.covid19reportcases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WHOActivity extends AppCompatActivity {

    private  WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who);

        webView = findViewById(R.id.webwho);

        webView.loadUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public");
    }
}
