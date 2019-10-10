package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMove, btnMoveData, btnCall, btnWeb, btnBuka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBuka=findViewById(R.id.btnBuka);
        btnBuka.setOnClickListener(this);

        btnMove = findViewById(R.id.btnMove);
        btnMove.setOnClickListener(this);

        btnWeb =findViewById(R.id.btnWeb);
        btnWeb.setOnClickListener(this);

        btnMoveData = findViewById(R.id.btnMoveData);
        btnMoveData.setOnClickListener(this);

        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnMove:
                Intent moveActivity = new Intent(this,MoveActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btnMoveData:
                Intent moveDataActivity = new Intent(this,MoveDataActivity.class);
                moveDataActivity.putExtra(MoveDataActivity.EXTRA_NAME, "Kang Repek");
                moveDataActivity.putExtra(MoveDataActivity.EXTRA_AGE,21);
                startActivity(moveDataActivity);
                break;
            case R.id.btnCall:
                String telfone = "082223237228";
                Intent callIntent =new Intent(Intent.ACTION_DIAL, Uri.parse ("tel: "+telfone));
                startActivity(callIntent);
                break;
            case R.id.btnWeb:
                String url = "https://ittelkom-pwt.ac.id";
                Intent browser = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(browser);
                break;
            case R.id.btnBuka:
                Intent bukak =new Intent(this,IntentActivity.class);
                startActivity(bukak);
                break;

        }
        }
    }