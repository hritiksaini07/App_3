package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.PersonName);
        e2=findViewById(R.id.EmailAddress);
        e3=findViewById(R.id.Password);
        e4=findViewById(R.id.Phone);
        b=findViewById(R.id.button);
        Intent i =new Intent(MainActivity.this,MainActivity2.class);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                i.putExtra("msg1",e1.getText().toString());
                startActivity(i);

            }
        });

    }
}