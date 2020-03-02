package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Laws extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);


        Button AbdulAwalBangladesh=(Button)findViewById(R.id.AbdulAwal);

        AbdulAwalBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01711004897"));
                startActivity(callIntent);
            }
        });

        Button AbdulAlimBangladesh=(Button)findViewById(R.id.AbdulAlim);

        AbdulAlimBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01819404437"));
                startActivity(callIntent);
            }
        });
    }
}
