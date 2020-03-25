package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class chittagangpart1 extends AppCompatActivity {

    Button beck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagangpart1);
        Toast.makeText(chittagangpart1.this, "Absolute Layout",Toast.LENGTH_SHORT).show();

        beck = (Button) findViewById(R.id.backbutton3);

        beck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(chittagangpart1.this,Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
