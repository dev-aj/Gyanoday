package com.example.aj.gyanoday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {
ImageButton i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        i1 = (ImageButton)findViewById(R.id.fee);
        i2 = (ImageButton)findViewById(R.id.contact);
        i3 = (ImageButton)findViewById(R.id.others);
        i4 = (ImageButton)findViewById(R.id.schedule);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Fee_structure.class);
                startActivity(i);
                finish();
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cont = new Intent(Menu.this,Contact.class);
                startActivity(cont);
                finish();
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sch = new Intent(Menu.this,Schedule.class);
                startActivity(sch);
                finish();
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oth = new Intent(Menu.this,Others.class);
                startActivity(oth);
                finish();
            }
        });

    }
    public void onBackPressed()
    {
        Intent i3 = new Intent(Menu.this,Homepge.class);
        startActivity(i3);
        finish();
    }
}
