package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar Bar;
    private TextView Time;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bar = findViewById(R.id.seekBar);
        Time = findViewById(R.id.textView);
        Bar.setMax(600);
        Bar.setProgress(60);
        Bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int minutes = progress/60;
                int seconds = progress - (minutes *60);
                String strMinutes = "";
                String strSeconds = "";
                if(minutes<10){
                    strMinutes="0"+ String.valueOf(minutes);
                }
                else{
                    strMinutes=String.valueOf(minutes);
                }

                if(seconds<10){
                    strSeconds="0"+ String.valueOf(seconds);
                }
                else{
                    strSeconds=String.valueOf(seconds);
                }
                Time.setText(strMinutes + ":" +strSeconds);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });
    }

    public void Start(View view) {
    }
}