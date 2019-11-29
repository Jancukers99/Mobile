package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SectionsPagerAdapter sectionsPagerAdapter =new SectionsPagerAdapter (this,getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tab = findViewById(R.id.tabs);
        tab.setupWithViewPager(viewPager);

        getSupportActionBar().setElevation(0);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.change_setting){
            Intent intel =new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(intel);
        }
        return super.onOptionsItemSelected(item);
    }
}
