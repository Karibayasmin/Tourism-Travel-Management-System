package com.example.hp.tourismandtravelmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class Login extends AppCompatActivity implements AsyncResponse, View.OnClickListener {

    EditText etusername,etpassword;
    Button blogin;
    Button signuplink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signuplink=(Button)findViewById(R.id.signuplink);
        signuplink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Signup.class);
                startActivity(i);
            }

        });




        etusername=(EditText)findViewById(R.id.etusername);
        etpassword=(EditText)findViewById(R.id.etpassword);
        blogin=(Button)findViewById(R.id.blogin);



        blogin.setOnClickListener(this);


    }



    @Override
    public void processFinish(String result)
    {
        if(result.equals("success"))
        {
            Intent in=new Intent(this,Ticket.class);
            startActivity(in);}

        else  {
            Toast.makeText(this,"May be u have given wrong username, password\n or you " +
                    "haven't signup yet successfully or your text fields are empty" +
                    ",Please try again",Toast.LENGTH_LONG).show();
        }




    }


    @Override
    public void onClick(View v) {

        HashMap postData = new HashMap();
        postData.put("mobile", "android");
        postData.put("txtUsername", etusername.getText().toString());
        postData.put("txtPassword", etpassword.getText().toString() );

        PostResponseAsyncTask task= new PostResponseAsyncTask (this,postData);
        task.execute("http://10.0.2.2/client/login.php");

    }




}