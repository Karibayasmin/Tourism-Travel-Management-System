package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);


        Button Bandarbanemergency=(Button)findViewById(R.id.bandarbanEmergency);

        Bandarbanemergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880186393449"));
                startActivity(callIntent);
            }
        });

        Button Bandarbandoctors=(Button)findViewById(R.id.bandarbandoctors);

        Bandarbandoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel: +8801983555687"));
                startActivity(callIntent);
            }
        });

        Button BandarbanMedicall=(Button)findViewById(R.id.bandarbanMedicall);

        BandarbanMedicall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880188229974"));
                startActivity(callIntent);
            }
        });

        Button BandarbanAmbulances=(Button)findViewById(R.id.bandarbanAmbulances);

        BandarbanAmbulances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880177666476"));
                startActivity(callIntent);
            }
        });



        Button CoxbazarEmergency=(Button)findViewById(R.id.coxbazarEmergency);

        CoxbazarEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880176393449"));
                startActivity(callIntent);
            }
        });

        Button Coxbazardoctors=(Button)findViewById(R.id.coxbazardoctors);

        Coxbazardoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+8801983445687"));
                startActivity(callIntent);
            }
        });

        Button  CoxbazarMedicall=(Button)findViewById(R.id.coxbazarMedicall);

        CoxbazarMedicall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880176229974 "));
                startActivity(callIntent);
            }
        });

        Button CoxbazarAmbulances=(Button)findViewById(R.id.coxbazarAmbulances);

        CoxbazarAmbulances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880177892476"));
                startActivity(callIntent);
            }
        });

        Button KuakataEmergency=(Button)findViewById(R.id.kuakataEmergency);

        KuakataEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880187283449"));
                startActivity(callIntent);
            }
        });

        Button Kuakatadoctors=(Button)findViewById(R.id.kuakatadoctors);

        Kuakatadoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880187445687"));
                startActivity(callIntent);
            }
        });

        Button  KuakataMedicall=(Button)findViewById(R.id.kuakataMedicall);

        KuakataMedicall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880176223746 "));
                startActivity(callIntent);
            }
        });

        Button KuakataAmbulances=(Button)findViewById(R.id.kuakataAmbulances);

        KuakataAmbulances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88018892476"));
                startActivity(callIntent);
            }
        });



        Button RangamatiEmergency=(Button)findViewById(R.id.rangamatiEmergency);

        RangamatiEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880187283449"));
                startActivity(callIntent);
            }
        });

        Button Rangamatidoctors=(Button)findViewById(R.id.rangamatidoctors);

        Rangamatidoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880187445687"));
                startActivity(callIntent);
            }
        });

        Button  RangamatiMedicall=(Button)findViewById(R.id.rangamatiMedicall);

        RangamatiMedicall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:: +880176223746 "));
                startActivity(callIntent);
            }
        });

        Button RangamatiAmbulances=(Button)findViewById(R.id.rangamatiAmbulances);

        RangamatiAmbulances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88018892476"));
                startActivity(callIntent);
            }
        });




        Button SaintmartinEmergency=(Button)findViewById(R.id.saintmartinEmergency);

        SaintmartinEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880187283449"));
                startActivity(callIntent);
            }
        });

        Button Saintmartindoctors=(Button)findViewById(R.id.saintmartindoctors);

        Saintmartindoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880187445687"));
                startActivity(callIntent);
            }
        });

        Button  SaintmartinMedicall=(Button)findViewById(R.id.saintmartinMedicall);

        SaintmartinMedicall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:: +880176223746  "));
                startActivity(callIntent);
            }
        });

        Button SaintmartinAmbulances=(Button)findViewById(R.id.saintmartinAmbulances);

        SaintmartinAmbulances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88018892476"));
                startActivity(callIntent);
            }
        });



        Button SundarbanEmergency=(Button)findViewById(R.id.sundarbanEmergency);

        SundarbanEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880187283449"));
                startActivity(callIntent);
            }
        });

        Button Sundarbandoctors=(Button)findViewById(R.id.sundarbandoctors);

        Sundarbandoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880187445687"));
                startActivity(callIntent);
            }
        });

        Button  SundarbanMedicall=(Button)findViewById(R.id.sundarbanMedicall);

        SundarbanMedicall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880176223746   "));
                startActivity(callIntent);
            }
        });

        Button SundarbanAmbulances=(Button)findViewById(R.id.sundarbanAmbulances);

        SundarbanAmbulances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:: +88018892476"));
                startActivity(callIntent);
            }
        });

        Button SylhetEmergency=(Button)findViewById(R.id.sylhetEmergency);

        SylhetEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880187283449"));
                startActivity(callIntent);
            }
        });

        Button Sylhetdoctors=(Button)findViewById(R.id.sylhetdoctors);

        Sylhetdoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880187445687"));
                startActivity(callIntent);
            }
        });

        Button  SylhetMedicall=(Button)findViewById(R.id.sylhetMedicall);

        SylhetMedicall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880176223746"));
                startActivity(callIntent);
            }
        });

        Button SylhetAmbulances=(Button)findViewById(R.id.sylhetAmbulances);

        SylhetAmbulances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:: +88018892476"));
                startActivity(callIntent);
            }
        });



    }
}
