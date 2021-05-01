package com.example.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button TryMe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TryMe= (Button) findViewById(R.id.tryMe);
        TryMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                windowView = findViewById(R.id.windowViewId);
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                windowView.setBackgroundColor(color);
            }

        });


    }
}