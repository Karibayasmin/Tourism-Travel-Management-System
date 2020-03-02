package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Confirm_ticket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_ticket);


        Button Bcashnumber=(Button)findViewById(R.id.bcash);

        Bcashnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*247#"));
                startActivity(callIntent);
            }
        });

        Button personalnumberBcashnumber=(Button)findViewById(R.id.personalnumber);

        personalnumberBcashnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01745610308"));
                startActivity(callIntent);
            }
        });

    }
}