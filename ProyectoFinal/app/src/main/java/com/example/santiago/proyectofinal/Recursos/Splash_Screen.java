package com.example.santiago.proyectofinal.Recursos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.santiago.proyectofinal.R;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread timer= new Thread(){
            public void run(){
                try{
                    sleep(7000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent (Splash_Screen.this,MainActivityPrincipal.class);
                    startActivity(intent);
                }
            }
        };

        timer.start();
    }

    protected void onPause(){
        super.onPause();
        finish();
    }

}
