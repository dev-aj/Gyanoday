package com.example.aj.gyanoday;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Fee_structure extends AppCompatActivity {
ImageButton reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_structure);
        reg = (ImageButton)findViewById(R.id.regbtn);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regform = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/xHWBCiFuQ96eMsyk1"));
                startActivity(regform);
            }
        });
    }
    public void onBackPressed()
    {
        Intent back = new Intent(Fee_structure.this,Menu.class);
        startActivity(back);
        finish();
    }
}
