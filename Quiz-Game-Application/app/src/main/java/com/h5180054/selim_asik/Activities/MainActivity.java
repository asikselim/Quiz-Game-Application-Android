package com.h5180054.selim_asik.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.h5180054.selim_asik.R;

public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startTimer();
    }


    private void startTimer() {
        CountDownTimer countDownTimer = new CountDownTimer(4000, 2000) {
            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {
                Intent secondActivityIntent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(secondActivityIntent);
                finish();
            }
        };
        countDownTimer.start();
    }


}


