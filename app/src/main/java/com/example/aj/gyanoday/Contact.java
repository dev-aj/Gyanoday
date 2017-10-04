package com.example.aj.gyanoday;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Contact extends AppCompatActivity {
ImageView cl,em,mp,wb,fb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        cl = (ImageView)findViewById(R.id.call);
        em = (ImageView)findViewById(R.id.email);
        mp = (ImageView)findViewById(R.id.map);
        wb = (ImageView)findViewById(R.id.web);
        fb = (ImageView)findViewById(R.id.facebook);
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:09973941944"));
                startActivity(call);
            }
        });
        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Send email","");
                Intent eml = new Intent(Intent.ACTION_SEND);
                //eml.setData(Uri.parse("mailto:"));
                eml.setData(Uri.parse("mailto:g.r.s.gyanodayschool@gmail.com"));
                eml.setType("text/plain");
                eml.putExtra(Intent.EXTRA_EMAIL, new String[] {"g.r.s.gyanodayschool@gmail.com"});
                eml.putExtra(Intent.EXTRA_SUBJECT,"ENQUIRIE/FEEDBACK");
                eml.putExtra(Intent.EXTRA_TEXT,"ASK your queries OR Give us feedback");
                if(eml.resolveActivity(getPackageManager()) != null){
                    startActivity(Intent.createChooser(eml,"Send Mail..."));

                    Log.i("Mail Sent","");
                }
                else{
                    Toast.makeText(Contact.this, "No Email Client App is Installed, Use the Browser", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q:telaiya+dam,+gyanoday+vidyalaya");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if(mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }
                else{
                    Toast.makeText(Contact.this, "MAP app is not installed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        wb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent website = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.gyanodayvidyalaya.com"));
                startActivity(website);
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebook = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com/gyanodayvidyalaya/"));
                startActivity(facebook);
            }
        });
    }
    public void onBackPressed()
    {
        Intent men = new Intent(Contact.this,Menu.class);
        startActivity(men);
        finish();
    }
}
