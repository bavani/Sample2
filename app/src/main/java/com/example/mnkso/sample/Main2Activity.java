package com.example.mnkso.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonNext=(Button)findViewById(R.id.buttonNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(i);

            }
        });
    }
    // Start the service
    public void startService(View view) {
        startService(new Intent(this, Myservice.class));
    }
    // Stop the service
    public void stopService(View view) {
        stopService(new Intent(this, Myservice.class));
    }
}