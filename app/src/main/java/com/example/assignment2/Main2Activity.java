package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button back;
    Button bandarban;
    Button dhaka;
    Button ctg;
    Button barishal;
    Button khulna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(Main2Activity.this, "Table Layout",Toast.LENGTH_SHORT).show();

        back = (Button) findViewById(R.id.backBUTTon);
        bandarban = (Button) findViewById(R.id.Bandarban);
        dhaka = (Button) findViewById(R.id.dhaka1);
        ctg = (Button) findViewById(R.id.CTG);
        barishal = (Button) findViewById(R.id.barishal);
        khulna = (Button) findViewById(R.id.khulna);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(i);
            }
        });

        bandarban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,bandarban.class);
                startActivity(i);
            }
        });

        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,dhakapart1.class);
                startActivity(i);
            }
        });

        ctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,chittagangpart1.class);
                startActivity(i);
            }
        });

        barishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,barishalpart1.class);
                startActivity(i);
            }
        });

        khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,khulnapart1.class);
                startActivity(i);
            }
        });
    }
}
