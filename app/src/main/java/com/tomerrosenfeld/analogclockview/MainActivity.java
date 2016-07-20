package com.tomerrosenfeld.analogclockview;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.tomerrosenfeld.customanalogclockview.CustomAnalogClock;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomAnalogClock customAnalogClock = (CustomAnalogClock) findViewById(R.id.analog_clock);
        updateClock(customAnalogClock);
    }

    private void updateClock(final CustomAnalogClock customAnalogClockView) {
        customAnalogClockView.setTime(Calendar.getInstance());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                updateClock(customAnalogClockView);
            }
        }, 5000);
    }
}
