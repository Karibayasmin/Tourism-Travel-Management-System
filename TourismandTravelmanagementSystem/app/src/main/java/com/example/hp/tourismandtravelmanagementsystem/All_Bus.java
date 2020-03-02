package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class All_Bus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__bus);


        Button GreenLineBangladesh=(Button)findViewById(R.id.GreenLine);

        GreenLineBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:02-7192300"));
                startActivity(callIntent);
            }
        });

        Button SAlamServiceBangladesh=(Button)findViewById(R.id.SAlamService);

        SAlamServiceBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01813-329394"));
                startActivity(callIntent);
            }
        });



        Button ShyamoliParibahanBangladesh=(Button)findViewById(R.id.ShyamoliParibahan);

        ShyamoliParibahanBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:02-900331"));
                startActivity(callIntent);
            }
        });


        Button HanifEnterpriseBangladesh=(Button)findViewById(R.id.HanifEnterprise);

        HanifEnterpriseBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0173-402670"));
                startActivity(callIntent);
            }
        });

        Button ShohagParibahanBangladesh=(Button)findViewById(R.id.ShohagParibahan);

        ShohagParibahanBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01711-612433"));
                startActivity(callIntent);
            }
        });

        Button SoudiaParibahanBangladesh=(Button)findViewById(R.id.SoudiaParibahan);

        SoudiaParibahanBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01919-654935"));
                startActivity(callIntent);
            }
        });


        Button EagleParibahanBangladesh=(Button)findViewById(R.id.EagleParibahan);

        EagleParibahanBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:02-9006700"));
                startActivity(callIntent);
            }
        });
    }
}
