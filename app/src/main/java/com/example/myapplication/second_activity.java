package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {
    TextView reciver_msg;
    TextView lname1;
    TextView email1;
    TextView pwd1;
    TextView spi;
    TextView gn22;
    TextView ce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        reciver_msg=(TextView)findViewById(R.id.recive_name);
        lname1=(TextView)findViewById(R.id.last_name);
        email1=(TextView)findViewById(R.id.email_name);
        pwd1=(TextView)findViewById(R.id.password);
        spi=(TextView)findViewById(R.id.city_name);
        gn22=(TextView)findViewById(R.id.gn11);
        ce=(TextView)findViewById(R.id.sww);
        Intent intent=getIntent();

        String str=intent.getStringExtra("fname");
        String str1=intent.getStringExtra("lname");
        String str2=intent.getStringExtra("email");
        String str3=intent.getStringExtra("pwd");
        String str4=intent.getStringExtra("sp1");
        String str5=intent.getStringExtra("cn1");
        String str6=intent.getStringExtra("s11");
        reciver_msg.setText(str);
        lname1.setText(str1);
        email1.setText(str2);
        pwd1.setText(str3);
        spi.setText(str4);
        gn22.setText(str5);
        ce.setText(str6);
    }
}