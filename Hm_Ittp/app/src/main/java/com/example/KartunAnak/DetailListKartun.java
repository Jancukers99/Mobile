package com.example.KartunAnak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListKartun extends AppCompatActivity {
    private int hmj_id;
    ImageView imgDetail;
    TextView tvName,tvDesc;
    private ArrayList<Hmj>listHmj=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_hmj);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        hmj_id= getIntent().getIntExtra("hmj_id",0);
        tvName=findViewById(R.id.hmj_nama);
        tvDesc=findViewById(R.id.desc_detail);
        imgDetail=findViewById(R.id.img_detail);
        listHmj.addAll(hmjdata.getListData());
        getSupportActionBar().setTitle(listHmj.get(hmj_id).getName());
        setLayout();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void setLayout() {
        tvName.setText(listHmj.get(hmj_id).getName());
        tvDesc.setText(listHmj.get(hmj_id).getDescription());
        Glide.with(this)
                .load(listHmj.get(hmj_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
