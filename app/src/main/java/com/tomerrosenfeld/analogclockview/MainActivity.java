package com.tomerrosenfeld.analogclockview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tomerrosenfeld.customanalogclockview.CustomAnalogClock;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("Hii");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomAnalogClock customAnalogClock = (CustomAnalogClock) findViewById(R.id.analog_clock);
        customAnalogClock.setAutoUpdate(true);
    }
}
