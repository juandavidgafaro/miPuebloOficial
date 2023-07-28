package com.example.pruebapueblofinal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer cancion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar barra = getSupportActionBar();
        barra.hide();


        cancion=MediaPlayer.create(this,R.raw.intro);
        cancion.start();

        //temporizar la duración del splash
        TimerTask inicioapp= new TimerTask() {
            @Override
            public void run() {

                //lanzar una nueva actividad
                Intent intent= new Intent(MainActivity.this,Home.class);
                cancion.stop();
                startActivity(intent);

            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicioapp,5000);

    }
}