package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class All_Train extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__train);


        Button BangladeshKOMLAPUR=(Button)findViewById(R.id.KOMLAPUR);

        BangladeshKOMLAPUR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:02-9358634"));
                startActivity(callIntent);
            }
        });


        Button BangladeshDhaka=(Button)findViewById(R.id.Dhaka);

        BangladeshDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:02-8924239"));
                startActivity(callIntent);
            }
        });



        Button CHITTAGONGBangladesh=(Button)findViewById(R.id.CHITTAGONG);

        CHITTAGONGBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:635162"));
                startActivity(callIntent);
            }
        });



        Button COMILLABangladesh=(Button)findViewById(R.id.COMILLA);

        COMILLABangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:76358"));
                startActivity(callIntent);
            }
        });



        Button SYLHETBangladesh=(Button)findViewById(R.id.SYLHET);

        SYLHETBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:717036"));
                startActivity(callIntent);
            }
        });



        Button RAJSHAHIBangladesh=(Button)findViewById(R.id.RAJSHAHI);

        RAJSHAHIBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0721-761940"));
                startActivity(callIntent);
            }
        });



        Button MYMENSINGHBangladesh=(Button)findViewById(R.id.MYMENSINGH);

        MYMENSINGHBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:55757"));
                startActivity(callIntent);
            }
        });


        Button KhulnaBangladesh=(Button)findViewById(R.id.KHULNA);

        KhulnaBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:041-723222"));
                startActivity(callIntent);
            }
        });


        Button JessoreBangladesh=(Button)findViewById(R.id.JESSORE);

        JessoreBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0421-65019"));
                startActivity(callIntent);
            }
        });


        Button DorshonaBangladesh=(Button)findViewById(R.id.DORSONA);

        DorshonaBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:07632-51200"));
                startActivity(callIntent);
            }
        });

    }
}
