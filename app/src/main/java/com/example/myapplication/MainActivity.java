package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity  {
 EditText fname;
    EditText lname;
    EditText email;
    EditText pwd;
    RadioGroup gender;
    Spinner city1;
    CheckBox active;
    Switch s1;
    Button register;
   // String[] city2={"rajkot","junagadh"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=(EditText)findViewById(R.id.edit_name);
        lname=(EditText)findViewById(R.id.edit_lname);
        email=(EditText)findViewById(R.id.edit_email);
        pwd=(EditText)findViewById(R.id.edit_password);
        gender=(RadioGroup)findViewById(R.id.radiogroup);
        city1=(Spinner)findViewById(R.id.spinner);
        active=(CheckBox)findViewById(R.id.checkbox);
        register=(Button)findViewById(R.id.register_btn);
        s1=(Switch)findViewById(R.id.switch1);



    //    city.setOnItemSelectedListener(this);
      //  ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,city2);
       // aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      //  city.setAdapter(aa);

        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {

                int selectdID = gender.getCheckedRadioButtonId();
                RadioButton gn= findViewById(selectdID);
                String sw1=" ";
                if(s1.isChecked())
                {
                    sw1 = "CE";
                }
                else
                {
                    sw1 = "IT";
                }

                String f_name=fname.getText().toString();
                String l_name=lname.getText().toString();
                String u_email=email.getText().toString();
                String pss=pwd.getText().toString();
                String sp=city1.getSelectedItem().toString();
                String c1= gn.getText().toString();


                Intent intent=new Intent(getApplicationContext(),second_activity.class);
                intent.putExtra("fname", f_name);
                intent.putExtra("lname",l_name);
                intent.putExtra("email",u_email);
                intent.putExtra("pwd",pss);
                intent.putExtra("sp1",sp);
                intent.putExtra("cn1",c1);
                intent.putExtra("s11",sw1);
               // intent.putExtra("data",String.valueOf(city.getSelectedItem()));
                startActivity(intent);
            }
        });

    }

}