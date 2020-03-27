package com.example.covid19reportcases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class NewsActivity extends AppCompatActivity {
    private WebView webView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.bbc.com/news/explainers");

        webView2= findViewById(R.id.webview2);
        webView2.loadUrl("https://edition.cnn.com/world/live-news/coronavirus-outbreak-03-22-20/index.html");
    }
}
