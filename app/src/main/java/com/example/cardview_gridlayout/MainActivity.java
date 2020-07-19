package com.example.cardview_gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView home, message, image, video, share, call, contact, mail, fingerprint, settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = findViewById(R.id.cv_home);
        message = findViewById(R.id.cv_message);
        image = findViewById(R.id.cv_image);
        video = findViewById(R.id.cv_video);
        share = findViewById(R.id.cv_share);
        call = findViewById(R.id.cv_call);
        contact = findViewById(R.id.cv_contact);
        mail = findViewById(R.id.cv_mail);
        fingerprint = findViewById(R.id.cv_fingerprint);
        settings = findViewById(R.id.cv_settings);

        home.setOnClickListener(this);
        message.setOnClickListener(this);
        image.setOnClickListener(this);
        video.setOnClickListener(this);
        share.setOnClickListener(this);
        call.setOnClickListener(this);
        mail.setOnClickListener(this);
        contact.setOnClickListener(this);
        fingerprint.setOnClickListener(this);
        settings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.cv_home:
                Intent intent = new Intent(MainActivity.this,Home_Activity.class);
                startActivity(intent);
                break;
            case R.id.cv_message:
                Intent intent1 = new Intent(MainActivity.this,Message_Activity.class);
                startActivity(intent1);
                break;
            case R.id.cv_image:
                Intent intent2 = new Intent(MainActivity.this,Image_Activity.class);
                startActivity(intent2);
                break;
            case R.id.cv_video:
                Intent intent3 = new Intent(MainActivity.this,Video_Activity.class);
                startActivity(intent3);
                break;
            case R.id.cv_share:
                Intent intent4 = new Intent(MainActivity.this,Share_Activity.class);
                startActivity(intent4);
                break;
            case R.id.cv_call:
                Intent intent5 = new Intent(MainActivity.this,Call_Activity.class);
                startActivity(intent5);
                break;
            case R.id.cv_mail:
                Toast.makeText(MainActivity.this,"Mails",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cv_contact:
                Toast.makeText(MainActivity.this,"Contacts",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cv_fingerprint:
                Toast.makeText(MainActivity.this,"Fingerprint",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cv_settings:
                Toast.makeText(MainActivity.this,"Settings",Toast.LENGTH_SHORT).show();
                break;
            }
    }
}
