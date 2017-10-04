package com.example.aj.gyanoday;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Others extends AppCompatActivity {
    Button b1,b2;
    ImageButton i2; ImageView i1;
     int i = 0;
    int []img = {R.drawable.lg,R.drawable.pr,R.drawable.mg1,R.drawable.mg,R.drawable.hl,R.drawable.cm};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
        b1 = (Button)findViewById(R.id.Next);
        b2 = (Button)findViewById(R.id.Prev);
        i2 = (ImageButton)findViewById(R.id.RegButton);
        i1 = (ImageView)findViewById(R.id.slideshow);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i >= 0 && i < 5) {
                    i++;
                    i1.setImageResource(img[i]);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i > 0 && i < 6)
                {
                    i--;
                    i1.setImageResource(img[i]);
                }


            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/xHWBCiFuQ96eMsyk1"));
                startActivity(reg);
            }
        });
    }
    public void onBackPressed()
    {
        Intent main = new Intent(Others.this,Menu.class);
        startActivity(main);
        finish();

    }

}
