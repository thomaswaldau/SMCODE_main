/*package com.tstp.smcode;

import android.app.Activity;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static com.tstp.smcode.R.id.time;

public class timeSketchAcitvity extends AppCompatActivity {
//Time mode for a sketch, clock ticks down and is set at 15 min
//To COME: UI and background


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_sketch_acitvity);

        final TextView character = (TextView) findViewById(R.id.txt_characterTime);
        final TextView attribute = (TextView) findViewById(R.id.txt_attributeTime);
        final TextView timeView = (TextView) findViewById(R.id.txt_clock);
        final Button startTime = (Button) findViewById(R.id.bnt_startClock);



        GameModes goTime = new GameModes(this);

        goTime.timeSketch();

        character.setText(goTime.character);
        attribute.setText(goTime.attribute);


        startTime.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub




            }
        });




    }



}
*/