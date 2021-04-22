package com.damio.unionmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent send = new Intent(getApplicationContext(),
                        IntroductionActivity.class);
                startActivity(send);
                finish();
            }
        }, 1500);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}