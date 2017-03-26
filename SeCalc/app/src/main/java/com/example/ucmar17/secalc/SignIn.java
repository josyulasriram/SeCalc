package com.example.ucmar17.secalc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;


public class SignIn extends AppCompatActivity  {
    Button b1;
    RadioGroup group;
    RadioButton stu, tea;
    EditText ed1,ed2;
    //String str1, str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        b1 = (Button)findViewById(R.id.Register);
        group = (RadioGroup) findViewById(R.id.Radio);
        stu = (RadioButton) findViewById(R.id.studentR);
        tea = (RadioButton) findViewById(R.id.teacherR);
        ed1 = (EditText)findViewById(R.id.editUsername);
        ed2 = (EditText)findViewById(R.id.editPassword);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals(null) || ed2.getText().toString().equals(null)){
                    System.out.println("Please Enter a UserName and/or Password");
                    return;
                }
                SharedPreferences sp = getPreferences(android.content.Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString(ed1.getText().toString(), ed2.getText().toString());
                editor.apply();
                boolean f = true;
                if(f) {
                    if(stu.isChecked()){
                        Intent i = new Intent(SignIn.this, ScientificCalc.class);
                        startActivity(i);
                    }
                    else
                        return;
                }
            }
        });
    }
}