package com.app.smktelkom.volume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText Panjang, Tinggi, Lebar;
    private Button btnkalkulasi;
    private TextView Hasil;
    private static final String STATE_HASIL = "state_hasil";

    @Override
    protected void onSaveInstanceState(Bundle outState){
        outState.putString(STATE_HASIL,Hasil.getText().toString());
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Panjang = (EditText)findViewById(R.id.panjang);
        Lebar = (EditText)findViewById(R.id.lebar);
        Tinggi = (EditText)findViewById(R.id.tinggi);
        btnkalkulasi = (Button)findViewById(R.id.btn_kalkulasi);
        Hasil = (TextView)findViewById(R.id.hasil);
        btnkalkulasi.setOnClickListener(this);

        if(savedInstanceState != null){
            String hasil = savedInstanceState.getString(STATE_HASIL);
            Hasil.setText(hasil);
        }

    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_kalkulasi){
            String lebar = Lebar.getText().toString().trim();
            String panjang = Panjang.getText().toString().trim();
            String tinggi = Tinggi.getText().toString().trim();
            boolean isi = false;

            if(TextUtils.isEmpty(panjang)){
                isi = true;
                Panjang.setError("Field Harus Diisi");
            }

            if(TextUtils.isEmpty(lebar)){
                isi = true;
                Lebar.setError("Field Harus Diisi");
            }

            if(TextUtils.isEmpty(tinggi)){
                isi = true;
                Tinggi.setError("Field Harus Diisi");
            }

            if(!isi){
                int l = Integer.parseInt(lebar);
                int p = Integer.parseInt(panjang);
                int t = Integer.parseInt(tinggi);
                int volume = l * p * t;
                Hasil.setText(String.valueOf(volume) + " cm") ;
            }
        }



    }
}
