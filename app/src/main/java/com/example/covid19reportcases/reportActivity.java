package com.example.covid19reportcases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class reportActivity extends AppCompatActivity  implements View.OnClickListener {
    private EditText rpname,ptnname,hmadress,phnumber,localg,state, comment;
    private Button sumbmit;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        databaseReference = FirebaseDatabase.getInstance().getReference("Data");


        rpname =findViewById(R.id.editText);
        ptnname = findViewById(R.id.editText2);
        hmadress= findViewById(R.id.editText3);
        phnumber = findViewById(R.id.editText4);
        localg = findViewById(R.id.editText5);
        state = findViewById(R.id.editText6);
        comment = findViewById(R.id.editText7);
        sumbmit = findViewById(R.id.button);

        sumbmit.setOnClickListener(this);

    }


    public void user_sending_request(){
        String rrpnam = rpname.getText().toString();
        String pptname = ptnname.getText().toString();
        String hhmadree = hmadress.getText().toString();
        String phnnumber = phnumber.getText().toString();
        String local= localg.getText().toString();
        String states =state.getText().toString();
        String comm = comment.getText().toString();
        String id = databaseReference.push().getKey();






        Data data = new Data(rrpnam,pptname,hhmadree,phnnumber,local,states,comm);
        databaseReference.child(id).setValue(data);

        rpname.setText("");
        ptnname.setText("");
        hmadress.setText("");
        phnumber.setText("");
        localg.setText("");
        state.setText("");
        comment.setText("");


        Toast.makeText(reportActivity.this, "report is submitd",Toast.LENGTH_SHORT).show();



    }


    @Override
    public void onClick(View v) {
        if (v==sumbmit){

            user_sending_request();
            startActivity(new Intent(this,NewsActivity.class));
        }
    }
}
