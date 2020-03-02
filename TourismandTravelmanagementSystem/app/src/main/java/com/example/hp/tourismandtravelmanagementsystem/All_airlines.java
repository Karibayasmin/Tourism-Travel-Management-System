package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class All_airlines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_airlines);

        Button AirarabiaBangladesh=(Button)findViewById(R.id.Airarabia);

        AirarabiaBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+8801713015354"));
                startActivity(callIntent);
            }
        });

        Button AirIndiaBangladesh=(Button)findViewById(R.id.AirIndia);

        AirIndiaBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88028611929"));
                startActivity(callIntent);
            }
        });

        Button AirChinaBangladesh=(Button)findViewById(R.id.AirChina);

        AirChinaBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88029555499"));
                startActivity(callIntent);
            }
        });

        Button AirFranceBangladesh=(Button)findViewById(R.id.AirFrance);

        AirFranceBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88029886634"));
                startActivity(callIntent);
            }
        });

        Button AirAsianaBangladesh=(Button)findViewById(R.id.AirAsiana);

        AirAsianaBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88029559930"));
                startActivity(callIntent);
            }
        });

        Button AirBimanBangladeshBangladesh=(Button)findViewById(R.id.AirBimanBangladesh);

        AirBimanBangladeshBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88028917400"));
                startActivity(callIntent);
            }
        });

        Button UnitedAirwaysBangladesh=(Button)findViewById(R.id.UnitedAirways);

        UnitedAirwaysBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88028860248"));
                startActivity(callIntent);
            }
        });

        Button SingaporeBangladesh=(Button)findViewById(R.id.Singapore);

        SingaporeBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88028811504"));
                startActivity(callIntent);
            }
        });

        Button SaudiArabianBangladesh=(Button)findViewById(R.id.SaudiArabian);

        SaudiArabianBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88028116856"));
                startActivity(callIntent);
            }
        });

        Button MalaysiaBangladesh=(Button)findViewById(R.id.Malaysia);

        MalaysiaBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88029888211"));
                startActivity(callIntent);
            }
        });

        Button KuwaitBangladesh=(Button)findViewById(R.id.Kuwait);

        KuwaitBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88028833840"));
                startActivity(callIntent);
            }
        });

    }
}
