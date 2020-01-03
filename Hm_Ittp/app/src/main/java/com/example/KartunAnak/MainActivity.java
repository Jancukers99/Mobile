package com.example.KartunAnak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHmj;
    private ArrayList<Hmj> list = new ArrayList<>();
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Anime");
        }
        rvHmj = findViewById(R.id.hmti);
        rvHmj.setHasFixedSize(true);
        list.addAll(hmjdata.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvHmj.setLayoutManager(new LinearLayoutManager(this));
        CardAdapter cardHmjAdapter = new CardAdapter(this, list);
        rvHmj.setAdapter(cardHmjAdapter);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.menu = menu;
        getMenuInflater().inflate(R.menu.menu_item, menu);
        invalidateOptionsMenu();
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.abot) {
            Intent about = new Intent(this, About.class);
            startActivity(about);
        }
        return super.onOptionsItemSelected(item);
    }
}
