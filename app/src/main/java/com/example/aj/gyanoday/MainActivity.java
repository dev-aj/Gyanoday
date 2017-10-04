package com.example.aj.gyanoday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Splash s = new Splash();
        s.start();
    }
    class Splash extends Thread{
        public void run()
        {
            try{
                sleep(2000);
            }catch (Exception e){}
            Intent i = new Intent(MainActivity.this,Homepge.class);
            startActivity(i);
            finish();
        }
    }
}
