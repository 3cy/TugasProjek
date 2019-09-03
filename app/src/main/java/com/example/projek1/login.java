package com.example.projek1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

     Button login;
     EditText user,pw ;
     String username,password ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login =  findViewById(R.id.login);
        user = findViewById(R.id.id_nama);
        pw = findViewById(R.id.id_pw);


        username=user.getText().toString();
        password=pw.getText().toString();
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                    Intent i = new Intent(login.this,home.class);
                    startActivity(i);
                }

        });

    }
}
