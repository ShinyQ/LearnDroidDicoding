package com.app.smktelkom.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button Pindah;
    private Button Data;
    private Button Dial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pindah = (Button)findViewById(R.id.pindah);
        Pindah.setOnClickListener(this);

        Data = (Button)findViewById(R.id.data);
        Data.setOnClickListener(this);

        Dial = (Button)findViewById(R.id.dial);
        Dial.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){

            case R.id.pindah:
                Intent moveIntent = new Intent(MainActivity.this,ActivityBerpindah.class);
                startActivity(moveIntent);
                break;

            case R.id.data:
                Intent dataIntent = new Intent(MainActivity.this, DataBerpindah.class );
                dataIntent.putExtra(DataBerpindah.EXTRA_NAME, "Kurniadi Ahmmad Wijaya");
                dataIntent.putExtra(DataBerpindah.EXTRA_AGE,16);
                startActivity(dataIntent);
                break;

            case R.id.dial:
                String nomor = "08124047478";
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +nomor));
                startActivity(dialIntent);
                break;
        }

    }
}
