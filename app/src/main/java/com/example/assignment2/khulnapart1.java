package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class khulnapart1 extends AppCompatActivity {

    Button beck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulnapart1);
        Toast.makeText(khulnapart1.this, "Absolute Layout",Toast.LENGTH_SHORT).show();

        beck = (Button) findViewById(R.id.backbutton5);

        beck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(khulnapart1.this,Main2Activity.class);
                startActivity(i);

            }
        });
    }
}
