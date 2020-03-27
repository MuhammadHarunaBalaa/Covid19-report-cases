package com.example.covid19reportcases;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contactoppActivity extends AppCompatActivity implements View.OnClickListener {
    private Button call, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactopp);

        call= findViewById(R.id.button2);
        message = findViewById(R.id.button3);
        call.setOnClickListener(this);
        message.setOnClickListener(this);

    }
    public void call_number(){
        final int REQUEST_PHONE_CALL = 1;

    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "08142953990"));

    if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
    }
      else{

        startActivity(intent);

    }
    }

    @Override
    public void onClick(View v) {
        if (v==call){
            call_number();




        }
        else if (v== message){
            startActivity( new Intent(this,reportActivity.class));
        }
    }
}
