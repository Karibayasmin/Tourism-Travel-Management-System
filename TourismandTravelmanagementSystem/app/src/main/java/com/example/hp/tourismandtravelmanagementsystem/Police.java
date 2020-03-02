package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Police extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);


        Button Bangladesh=(Button)findViewById(R.id.BangladeshAir);

        Bangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:Call 0361-62233"));
                startActivity(callIntent);
            }
        });


        Button Coxbazarpolice=(Button)findViewById(R.id.coxbazarpolice);

        Coxbazarpolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01769-690732"));
                startActivity(callIntent);
            }
        });



        Button Kuakatapolice=(Button)findViewById(R.id.kuakatapolice);

        Kuakatapolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01769-690719"));
                startActivity(callIntent);
            }
        });



        Button Rangamatipolice=(Button)findViewById(R.id.rangamatipolice);

        Rangamatipolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01730-336137"));
                startActivity(callIntent);
            }
        });



        Button Saintmartinpolice=(Button)findViewById(R.id.saintmartinpolice);

        Saintmartinpolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01769-690742"));
                startActivity(callIntent);
            }
        });



        Button Sundarbanpolice=(Button)findViewById(R.id.sundarbanpolice);

        Sundarbanpolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01769-690007"));
                startActivity(callIntent);
            }
        });



        Button Sylhetpolice=(Button)findViewById(R.id.sylhetpolice);

        Sylhetpolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01713-374363"));
                startActivity(callIntent);
            }
        });

    }
}
