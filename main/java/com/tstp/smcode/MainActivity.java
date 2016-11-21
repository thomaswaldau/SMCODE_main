package com.tstp.smcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//Will be 4 buttons to start diffrent gamemodes. The game modes are in GameModes.class
//TO COME: The last two onClick events and buttons - UI and background
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sketch = (Button) findViewById(R.id.btn_sketch);
        Button timeSketch = (Button) findViewById(R.id.btn_time_sketch);
        Button colorSketch = (Button) findViewById(R.id.btn_Color_sketch);

        sketch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goSketch = new Intent(getApplicationContext(), SketchActivity.class);
                startActivity(goSketch);
            }
        });


        /*timeSketch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goTime = new Intent(getApplicationContext(), timeSketchAcitvity.class);
                startActivity(goTime);
            }
        } );*/

        colorSketch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goColor = new Intent(getApplicationContext(), ColorSketch.class);
                startActivity(goColor);
            }
        });

    }
}
