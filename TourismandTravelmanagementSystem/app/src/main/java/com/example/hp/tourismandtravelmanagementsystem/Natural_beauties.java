package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Natural_beauties extends AppCompatActivity {

    ImageView sundarban;
    ImageView saintmartin;
    ImageView Sylhet;
    ImageView sixtydome;
    ImageView kuakata;
    ImageView bandarban;
    ImageView rangamati;
    ImageView coxbazar;
    ImageView bogra;
    ImageView lalbagh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural_beauties);

        sundarban=(ImageView)findViewById(R.id.sundarban);
        sundarban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Shundarban_description.class);
                startActivity(i);
            }

        });

        saintmartin=(ImageView)findViewById(R.id.saintmartin);
        saintmartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Saint_Martin_Description.class);
                startActivity(i);
            }

        });

        Sylhet=(ImageView)findViewById(R.id.Sylhet);
        Sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Sylhet_Description.class);
                startActivity(i);
            }

        });

        sixtydome=(ImageView)findViewById(R.id.sixtydome);
        sixtydome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Sixty_dome_Mosque.class);
                startActivity(i);
            }

        });

        kuakata=(ImageView)findViewById(R.id.kuakata);
        kuakata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Kuakata_description.class);
                startActivity(i);
            }

        });

        bandarban=(ImageView)findViewById(R.id.bandarban);
        bandarban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Bandarban_Description.class);
                startActivity(i);
            }

        });

        bandarban=(ImageView)findViewById(R.id.bandarban);
        bandarban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Bandarban_Description.class);
                startActivity(i);
            }

        });

        rangamati=(ImageView)findViewById(R.id.rangamati);
        rangamati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Rangamati_Description.class);
                startActivity(i);
            }

        });

        coxbazar=(ImageView)findViewById(R.id.coxbazar);
        coxbazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Cox_Bazar.class);
                startActivity(i);
            }

        });

        bogra=(ImageView)findViewById(R.id. bogra);
        bogra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Bogra_Description.class);
                startActivity(i);
            }

        });

        lalbagh=(ImageView)findViewById(R.id. lalbagh);
        lalbagh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lalbagh_description.class);
                startActivity(i);
            }

        });
    }
}
