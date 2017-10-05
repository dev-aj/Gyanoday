package com.example.aj.gyanoday;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Homepge extends AppCompatActivity {
Button men;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepge);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        men = (Button)findViewById(R.id.menu);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Click On Go To Main Menu Button for more information", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });
        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent me = new Intent(Homepge.this,Menu.class);
                startActivity(me);
                finish();
            }
        });
    }

}
