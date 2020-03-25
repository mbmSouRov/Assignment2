package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class viewPlace extends AppCompatActivity implements View.OnClickListener{

    private ImageView frst,sec,thrd,frth,ffth,sxth;

    Button beck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_place);
        Toast.makeText(viewPlace.this, "Frame Layout",Toast.LENGTH_SHORT).show();

        beck = (Button) findViewById(R.id.back1);

        beck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(viewPlace.this,MainActivity.class);
                startActivity(i);
            }
        });

        frst = (ImageView) findViewById(R.id.first);
        sec = (ImageView) findViewById(R.id.second);
        thrd = (ImageView) findViewById(R.id.third);
        frth = (ImageView) findViewById(R.id.fourth);
        ffth = (ImageView) findViewById(R.id.fifth);
        sxth = (ImageView) findViewById(R.id.sixth);

        frst.setOnClickListener(this);
        sec.setOnClickListener(this);
        thrd.setOnClickListener(this);
        frth.setOnClickListener(this);
        ffth.setOnClickListener(this);
        sxth.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.first)
        {
            frst.setVisibility(View.GONE);
            sec.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.second)
        {
            sec.setVisibility(View.GONE);
            thrd.setVisibility(View.VISIBLE);
        }
        else if(v.getId() == R.id.third)
        {
            thrd.setVisibility(View.GONE);
            frth.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.fourth)
        {
            frth.setVisibility(View.GONE);
            ffth.setVisibility(View.VISIBLE);
        }
        if(v.getId() == R.id.fifth)
        {
            ffth.setVisibility(View.GONE);
            sxth.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.sixth)
        {
            sxth.setVisibility(View.GONE);
            frst.setVisibility(View.VISIBLE);
        }

    }
}
