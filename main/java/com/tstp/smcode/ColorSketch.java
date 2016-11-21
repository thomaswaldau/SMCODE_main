package com.tstp.smcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ColorSketch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_sketch);
        TextView character = (TextView) findViewById(R.id.txt_characterColor);
        TextView color = (TextView) findViewById(R.id.txt_colors);
        TextView attribute = (TextView)findViewById(R.id.txt_attributeCOlor);
        TextView emotion = (TextView)findViewById(R.id.txt_emotionColor);
        GameModes goColor = new GameModes(this);
        goColor.colorSketch();
        character.setText(goColor.character);
        color.setText(goColor.color);
        attribute.setText(goColor.attribute);
        emotion.setText(goColor.emotion);
    }
}
