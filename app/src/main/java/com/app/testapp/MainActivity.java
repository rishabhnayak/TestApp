package com.app.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //step 1
    TextView title;
    EditText name,email,password;
    Button button;
    String namevalue,emailvalue,passwordvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test5);
    //step 2
        title = findViewById(R.id.title);
        name = findViewById(R.id.name);
        button = findViewById(R.id.button);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);


        title.setTextColor(Color.parseColor("#ddaade"));
        title.setTextSize(50f);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namevalue = name.getText().toString();
                emailvalue = email.getText().toString();
                passwordvalue = password.getText().toString();
                checkPassword();
            }
        });
    }


    public void checkPassword(){
        if (passwordvalue.equals("abc@123")&&emailvalue.equals("ris@gmail.com")&&namevalue.equals("rishabh")){
            Toast.makeText(this, "Id and Password is correct", Toast.LENGTH_SHORT).show();
//jump intent
            Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
            startActivity(intent);
            finish();

        }else {
            Toast.makeText(this, "Wrong cred", Toast.LENGTH_SHORT).show();
        }
    }



}