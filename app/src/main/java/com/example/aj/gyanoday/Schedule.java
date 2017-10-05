package com.example.aj.gyanoday;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Schedule extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule2);
        b1 = (Button)findViewById(R.id.enq);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enq = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/PWk1ZWU2we3xi8w83"));
                startActivity(enq);
            }
        });
    }
    public void onBackPressed()
    {
        Intent men = new Intent(Schedule.this,Menu.class);
        startActivity(men);
        finish();
    }
}
