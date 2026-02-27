package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//New Activity
public class ShowActivity extends AppCompatActivity {

    //Declare attributes
    private TextView name;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set layout
        setContentView(R.layout.showactivity1);

        //Textview to display city name
        name = findViewById(R.id.cityName);

        //Back button
        back = findViewById(R.id.backButton);

        Intent intent = getIntent();
        //Get the city name as a string
        String cityName = intent.getStringExtra("cityName");

        //Set text of TextView
        name.setText(cityName);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Go back to main activity
                finish();
            }
        });

    }
}
