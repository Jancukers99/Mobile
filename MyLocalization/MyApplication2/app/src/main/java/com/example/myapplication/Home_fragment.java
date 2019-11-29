package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class Home_fragment extends Fragment {

    public Home_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup)
                inflater.inflate(R.layout.fragment_home_fragment,null);

        TextView tvgoal = root.findViewById(R.id.tv_ml);
        TextView tvser = root.findViewById(R.id.tv_plur);
        TextView tvs = root.findViewById(R.id.tv_xliff);
        int goal1 =2;
        int goal2 =0;
        String football = String.format(getResources().getString(R.string.goal),"Benny","Benckman",goal1,goal2);
        tvgoal.setText(football);

        int songCount =5;
        String plurat = getResources().getQuantityString(R.plurals.numberOfSongsAvailable,songCount,songCount);
        tvser.setText(plurat);

        tvs.setText(getResources().getString(R.string.app_homeurl));
        return root;
    }

}
