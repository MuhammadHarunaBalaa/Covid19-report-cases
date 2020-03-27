package com.example.covid19reportcases;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.VideoView;

public class CareActivity extends AppCompatActivity implements View.OnClickListener {
    private WebView webView;
    private Button who,wash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care);

        who= findViewById(R.id.who);
        wash= findViewById(R.id.button4);

        wash.setOnClickListener(this);
        who.setOnClickListener(this);








    }

    @Override
    public void onClick(View v) {
        if (v == wash){
            startActivity(new Intent(this,washActivity.class));
        }
        else if (v==who){
            startActivity(new Intent(this,WHOActivity.class));
        }
    }
}
