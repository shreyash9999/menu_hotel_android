package com.vortex.learnslides;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.net.Uri;


import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {
    CardView starterCardIn;
    CardView mainCardIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainCardIn = findViewById(R.id.cardViewMain);
        mainCardIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mainActivityMain = new Intent(MainActivity.this, MainActivityMain.class);
                startActivity(mainActivityMain);
            }
        });

        starterCardIn = findViewById(R.id.cardViewStarter);
        starterCardIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent starterActivityMain = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(starterActivityMain);

            }
        });

        TextView viewEmail = findViewById(R.id.bellowHeading);
        viewEmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent emailClick = new Intent(Intent.ACTION_SENDTO);
                emailClick.setData(Uri.parse("mailto:prudentshights@gmail.com"));
                startActivity(emailClick);
            }
        });
    }
}