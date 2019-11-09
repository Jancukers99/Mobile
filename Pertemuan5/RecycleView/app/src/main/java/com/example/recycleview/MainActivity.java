package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView pet;
private ArrayList<Hmj>list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pet = findViewById(R.id.halah);
        pet.setHasFixedSize(true);
    if (getSupportActionBar()!=null){
        getSupportActionBar().setTitle("Nanatsu no Taizai");
        }
    list.addAll(getListHmj());
    showRecycleList();
    }

    public ArrayList<Hmj>getListHmj(){
        String[]data =getResources().getStringArray(R.array.data_nama);
        String[] kopet =getResources().getStringArray(R.array.data_desc);
        String[] ceko =getResources().getStringArray(R.array.photo);
        ArrayList<Hmj>list =new ArrayList<>();
        for (int i=0;i<data.length;i++){
            Hmj hmj =new Hmj();
            hmj.setName(data[i]);
            hmj.setDescription(kopet[i]);
            hmj.setPhoto(ceko[i]);
            list.add(hmj);
        }
        return list;
    }
    private void showRecycleList(){
        pet.setLayoutManager(new LinearLayoutManager(this));
        ListHmAdapter listHmAdapter =new ListHmAdapter(list);
        pet.setAdapter(listHmAdapter);
    }
}
