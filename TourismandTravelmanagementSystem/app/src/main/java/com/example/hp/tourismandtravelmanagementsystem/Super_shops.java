package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Super_shops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_shops);

        Button BashundharaBangladesh=(Button)findViewById(R.id.Bashundhara);

        BashundharaBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880 2-9111440"));
                startActivity(callIntent);
            }
        });

        Button AlmasBangladesh=(Button)findViewById(R.id.Almas);

        AlmasBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880 1712-586896"));
                startActivity(callIntent);
            }
        });

        Button MeenaBazarBangladesh=(Button)findViewById(R.id.MeenaBazar);

        MeenaBazarBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880 2-9139849"));
                startActivity(callIntent);
            }
        });

        Button CarrefamilyBangladesh=(Button)findViewById(R.id.Carrefamily);

        CarrefamilyBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880 2-9139849"));
                startActivity(callIntent);
            }
        });

        Button AmanaBangladesh=(Button)findViewById(R.id.Amana);

        AmanaBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880 2-8931114"));
                startActivity(callIntent);
            }
        });

        Button PriyoShopBangladesh=(Button)findViewById(R.id.PriyoShop);

        PriyoShopBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880 1717-864118"));
                startActivity(callIntent);
            }
        });

        Button AgoraBangladesh=(Button)findViewById(R.id.Agora);

        AgoraBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880 1713-124672"));
                startActivity(callIntent);
            }
        });
    }
}
