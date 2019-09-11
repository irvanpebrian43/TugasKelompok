package com.example.tugaskelompok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private int waktu_loading=2000;

    //2000=2 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash_screen);

        Handler hade=new Handler();
        hade.postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent DashboardActivity=new Intent(SplashScreen.this,DashboardActivity.class);
                startActivity(DashboardActivity);
                finish();

            }
        },waktu_loading);
    }
}