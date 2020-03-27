

package com.example.covid19reportcases;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InsideActivity extends AppCompatActivity  implements View.OnClickListener {
    private CardView report, news,care;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside);

        report = findViewById(R.id.cardView);
        news= findViewById(R.id.cardView2);
        care=findViewById(R.id.card3);

        report.setOnClickListener(this);
        news.setOnClickListener(this);
        care.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v== report){
            startActivity(new Intent(InsideActivity.this,contactoppActivity.class));

        }
        else if (v==news){
            startActivity(new Intent(InsideActivity.this,NewsActivity.class));

        }
        else if (v==care){
            startActivity(new Intent(InsideActivity.this,CareActivity.class));

        }
    }
}
