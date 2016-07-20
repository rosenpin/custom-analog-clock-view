package com.tomerrosenfeld.analogclockview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tomerrosenfeld.customanalogclockview.CustomAnalogClock;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomAnalogClock customAnalogClock = (CustomAnalogClock) findViewById(R.id.analog_clock);
    }
}
