package com.alichis.dvpgiomov.quierocomer;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    TextView splashtext;
    /*declaracion de metodo para la tipografia*/
    private Typeface gobors;
    /*declaracion para el metodo de los segundos de duracion*/
    private static final long SPLASH=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashtext=(TextView) findViewById(R.id.texsplash);


        TimerTask task =new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this,Locations.class);
                startActivity(intent);
                finish();
            }
        };


        Timer timer=new Timer();
        timer.schedule(task,SPLASH);


        /*creando el metodo,tomando referencia y emviando la tipografia*/
        String fuente = "Fontsapp/gobor.ttf";
        this.gobors=Typeface.createFromAsset(getAssets(),fuente);
        splashtext.setTypeface(gobors);

    }
}
