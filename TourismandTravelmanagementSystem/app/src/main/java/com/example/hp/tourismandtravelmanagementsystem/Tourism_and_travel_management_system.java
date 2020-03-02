package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Tourism_and_travel_management_system extends AppCompatActivity implements View.OnClickListener {

    LinearLayout attraction;
    LinearLayout supershops;
    LinearLayout locationmap;
    LinearLayout airportguide;
    LinearLayout tourismlaw;
    LinearLayout greetings;
    ImageView doctor,police;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism_and_travel_management_system);


        attraction=(LinearLayout)findViewById(R.id.attraction);
        supershops = (LinearLayout) findViewById(R.id.supershops);
        locationmap = (LinearLayout) findViewById(R.id.locationmap);
        airportguide = (LinearLayout) findViewById(R.id. airportguide);
        tourismlaw = (LinearLayout) findViewById(R.id. tourismlaw);
        greetings = (LinearLayout) findViewById(R.id. greetings);
        doctor = (ImageView) findViewById(R.id.doctor);
        police = (ImageView) findViewById(R.id.police);



        attraction.setOnClickListener(this);
        supershops.setOnClickListener(this);
        locationmap.setOnClickListener(this);
        airportguide.setOnClickListener(this);
        tourismlaw.setOnClickListener(this);
        greetings.setOnClickListener(this);
        doctor.setOnClickListener(this);
        police.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.attraction:
                startActivity(new Intent(this, Natural_beauties.class));
                break;

            case R.id.supershops:
                startActivity(new Intent(this, Super_shops.class));
                break;

            case R.id.locationmap:
                startActivity(new Intent(this, Map.class));
                break;

            case R.id.airportguide:
                startActivity(new Intent(this, Login.class));
                break;

            case R.id.tourismlaw:
                startActivity(new Intent(this, Laws.class));
                break;

            case R.id.greetings:
                startActivity(new Intent(this, Greetings.class));
                break;

            case R.id.doctor:
                startActivity(new Intent(this, Hospital.class));
                break;

            case R.id.police:
                startActivity(new Intent(this, Police.class));
                break;
        }

    }



}