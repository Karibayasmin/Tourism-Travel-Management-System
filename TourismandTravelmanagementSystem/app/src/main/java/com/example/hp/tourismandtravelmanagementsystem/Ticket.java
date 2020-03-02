package com.example.hp.tourismandtravelmanagementsystem;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.*;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;


public class Ticket extends AppCompatActivity implements View.OnClickListener{
    Button bus;
    Button Train;
    Button bangladeshitourist;
    Button Allairlines;
    private   Button submit;
    private   EditText etPassword;
    private   EditText  etUsername;
    private   EditText etName;
    private   EditText etEmail;
    private   EditText etCountryName;
    private   EditText etGender;

    private static final String REGISTER_URL="http://10.0.2.2/tourism/index.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        bangladeshitourist=(Button)findViewById(R.id.bangladeshitourist);
        bangladeshitourist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Confirm_ticket.class);
                startActivity(i);
            }

        });

        Allairlines=(Button)findViewById(R.id.Allairlines);
        Allairlines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), All_airlines.class);
                startActivity(i);
            }

        });

        bus=(Button)findViewById(R.id.bus);
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), All_Bus.class);
                startActivity(i);
            }

        });

        Train=(Button)findViewById(R.id.Train);
        Train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), All_Train.class);
                startActivity(i);
            }

        });

        etPassword=(EditText)findViewById(R.id.etPassword);
        etUsername=(EditText)findViewById(R.id.etUsername);
        etName=(EditText)findViewById(R.id.etName);
        etGender= (EditText)findViewById(R.id.etGender);
        etCountryName=(EditText)findViewById(R.id.etCountryName);
        etEmail=(EditText)findViewById(R.id.etEmail);
        submit=(Button)findViewById(R.id.submit);



        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==submit){
            registerUser();
        }
    }

    private void registerUser(){
        String name=etName.getText().toString().trim();
        String countryname=etCountryName.getText().toString().trim();
        String email=etEmail.getText().toString().trim();
        String gender=etGender.getText().toString().trim();
        String username=etUsername.getText().toString().trim();
        String password=etPassword.getText().toString().trim();

        register(name, countryname, email, gender, username, password);

    }

    private void register(String name,String countryname,String email,String gender,String  username,String password){
        class RegisterUser extends AsyncTask<String,Void,String>{
            ProgressDialog loading;
            RegisterUserClass ruc=new RegisterUserClass();

            @Override
            protected void onPreExecute(){
                super.onPreExecute();
                loading=ProgressDialog.show(Ticket.this,"Please wait",null,true,true);
            }

            @Override
            protected void onPostExecute(String s){
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(),"Please wait for our confirmation message",Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(String...params){
                HashMap<String,String> data=new HashMap<String,String>();
                data.put("name",params[0]);
                data.put("countryname",params[1]);
                data.put("email",params[2]);
                data.put("gender",params[3]);
                data.put("username",params[4]);
                data.put("password",params[5]);

                String result= ruc.sendPostRequest(REGISTER_URL,data);

                return result;
            }
        }

        RegisterUser ru=new RegisterUser();
        ru.execute(name, countryname, email, gender, username, password);
    }
    @Override
    protected void onDestroy(){
        android.os.Process.killProcess(Process.myPid());
        super.onDestroy();
    }
}
