package com.example.ethannguonly.honorcodecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    ImageButton home, calc, settings;
    Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = (ImageButton)findViewById(R.id.home);
        calc = (ImageButton) findViewById(R.id.calculate);
        settings = (ImageButton)findViewById(R.id.settings);
        register = (Button)findViewById(R.id.buttonRegister);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.home);

            }
        });
      register.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              setContentView(R.layout.registration);
          }
      });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
setContentView(R.layout.calculator);
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





    }

}
