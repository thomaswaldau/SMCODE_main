package com.tstp.smcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class customSketch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_sketch);
        CheckBox charBox = (CheckBox) findViewById(R.id.cb_characterCustom);

        charBox.isChecked();
    }
}
