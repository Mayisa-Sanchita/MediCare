package com.example.medicare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindMedicine extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_medicine);
        button2 = (Button) findViewById(R.id.rajButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),KhulnaActivity.class);
                startActivity(dcIntent);
            }
        });
       /* button2 = (Button) findViewById(R.id.chiButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),RajshahiActivity.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.DhButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),KhulnaActivity.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.khulnaButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),RajshahiActivity.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.bariButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),RajshahiActivity.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.sylButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),RajshahiActivity.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.myButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),RajshahiActivity.class);
                startActivity(dcIntent);
            }
        });*/
    }
}
