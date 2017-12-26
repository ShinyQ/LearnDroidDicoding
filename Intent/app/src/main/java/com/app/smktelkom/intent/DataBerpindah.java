package com.app.smktelkom.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DataBerpindah extends AppCompatActivity {

    public static String EXTRA_AGE="extra_age";
    public static String EXTRA_NAME="extra_name";
    public TextView Data_Received;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_berpindah);

        Data_Received = (TextView)findViewById(R.id.data_received);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE,0);

        String text = "Name : " +name+ ", Your Age : "+age;
        Data_Received.setText(text);
    }
}
