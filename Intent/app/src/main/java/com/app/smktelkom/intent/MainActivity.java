package com.app.smktelkom.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button Pindah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pindah = (Button)findViewById(R.id.pindah);
        Pindah.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.pindah:
                Intent moveIntent = new Intent(MainActivity.this,ActivityBerpindah.class);
                startActivity(moveIntent);
                break;
        }

    }
}
