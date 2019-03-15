package com.example.acer.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView m1,m2,m3,m4,m5,m6,m7,m8,m9;
    int c1=0;

    int[] i1 = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = (ImageView) findViewById(R.id.image1);
        m2 = (ImageView) findViewById(R.id.image2);
        m3 = (ImageView) findViewById(R.id.image3);
        m4 = (ImageView) findViewById(R.id.image4);
        m5 = (ImageView) findViewById(R.id.image5);
        m6 = (ImageView) findViewById(R.id.image6);
        m7 = (ImageView) findViewById(R.id.image7);
        m8 = (ImageView) findViewById(R.id.image8);
        m9 = (ImageView) findViewById(R.id.image9);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.setImageResource(i1[c1]);
                c1++;
                if(c1==9){
                    c1=0;
                }
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.setImageResource(i1[c1]);
                c1++;
                if(c1==9){
                    c1=0;
                }
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3.setImageResource(i1[c1]);
                c1++;
                if(c1==9){
                    c1=0;
                }
            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4.setImageResource(i1[c1]);
                c1++;
                if(c1==9){
                    c1=0;
                }
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5.setImageResource(i1[c1]);
                c1++;
                if(c1==9){
                    c1=0;
                }
            }
        });

        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m6.setImageResource(i1[c1]);
                c1++;
                if(c1==9){
                    c1=0;
                }
            }
        });

        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m7.setImageResource(i1[c1]);
                c1++;
                if(c1==9){
                    c1=0;
                }
            }
        });

        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m8.setImageResource(i1[c1]);
                c1++;
                if(c1==9){
                    c1=0;
                }
            }
        });

        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m9.setImageResource(i1[c1]);
                c1++;
                if(c1==9){
                    c1=0;
                }
            }
        });

    }
}
