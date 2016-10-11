package com.example.mahendran.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sendMessage(View view) {
        // Do something in response to button click
        Button popMovie=(Button)findViewById(R.id.pop_movies);
        Button stockHawk=(Button)findViewById(R.id.stock_hawk);
        Button buildItBigger=(Button)findViewById(R.id.build_it_bigger);
        Button makeYourAppMaterial=(Button)findViewById(R.id.make_your_app_material);
        Button goUbiquitous=(Button)findViewById(R.id.go_ubiquitous);
        Button capstone=(Button)findViewById(R.id.capstone);
        popMovie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),"This Button will launch my Popular Movies app",Toast.LENGTH_SHORT).show();
            }
        });
        stockHawk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),"This Button will launch my Stock Hawk app",Toast.LENGTH_SHORT).show();
            }
        });
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),"This Button will launch my Build It Bigger app",Toast.LENGTH_SHORT).show();
            }
        });
        makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),"This Button will launch my Make Your App Material app",Toast.LENGTH_SHORT).show();
            }
        });
        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),"This Button will launch my Go Ubiquitous app",Toast.LENGTH_SHORT).show();
            }
        });
        capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),"This Button will launch my Capstone app",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
