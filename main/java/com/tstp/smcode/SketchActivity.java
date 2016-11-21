package com.tstp.smcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SketchActivity extends AppCompatActivity {
//Generats text fields from gamemodes
    //TO COME: UI and background

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sketch);
        TextView character = (TextView)findViewById(R.id.txt_character);
        TextView attribute = (TextView)findViewById(R.id.txt_attribute);
        TextView setting = (TextView)findViewById(R.id.txt_setting);
        TextView bckgrnd = (TextView)findViewById(R.id.txt_background);
        TextView emotion = (TextView)findViewById(R.id.txt_emotion);

        GameModes sketchNow = new GameModes(this);

        sketchNow.sketch();

        character.setText(sketchNow.character);
        attribute.setText(sketchNow.attribute);
        setting.setText(sketchNow.setting);
        bckgrnd.setText(sketchNow.bckgrnd);
        emotion.setText(sketchNow.emotion);


    }
}
