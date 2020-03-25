package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bandarban extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandarban);
        Toast.makeText(bandarban.this, "Absolute Layout",Toast.LENGTH_SHORT).show();

        back = (Button) findViewById(R.id.backbutton1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(bandarban.this,Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
