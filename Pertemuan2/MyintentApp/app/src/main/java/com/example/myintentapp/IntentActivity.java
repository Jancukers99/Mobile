package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class IntentActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Eek;
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        Eek =findViewById(R.id.Eek);

        btnGo = findViewById(R.id.btnGo);
        btnGo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnGo) {
            String tul =Eek.getText().toString();
            if (TextUtils.isEmpty(tul)){
                Eek.setError("Di Isi Njengs Aja Kosong");
            }else {
                Intent jancu =new Intent(this,Halaman2Activity.class);
                jancu.putExtra(Halaman2Activity.EXTRA_DATA,tul);
                startActivity(jancu);
            }
    }
    }
}