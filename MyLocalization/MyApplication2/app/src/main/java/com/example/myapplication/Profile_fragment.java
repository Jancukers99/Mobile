package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Profile_fragment extends Fragment {


    public Profile_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //   return inflater.inflate(R.layout.fragment_profile_fragment, container, false);
        ViewGroup root = (ViewGroup)
                inflater.inflate(R.layout.fragment_profile_fragment, null);
        TextView jess = root.findViewById(R.id.kopet);
        TextView bruttt = root.findViewById(R.id.tkp);
        TextView ekkk = root.findViewById(R.id.ee);
        TextView benn = root.findViewById(R.id.hobi);
        TextView cu = root.findViewById(R.id.qite);
        TextView oyyy = root.findViewById(R.id.anser);

        String adres = String.format(getResources().getString(R.string.address));
        jess.setText(adres);
        String jawa= String.format(getResources().getString(R.string.myaddress));
        bruttt.setText(jawa);
        String hob = String.format(getResources().getString(R.string.hobby));
        ekkk.setText(hob);
        String as = String.format(getResources().getString(R.string.myhobby));
        benn.setText(as);
        String hboy = String.format(getResources().getString(R.string.quotes));
        cu.setText(hboy);
        String sukur =String.format(getResources().getString(R.string.myquote));
        oyyy.setText(sukur);
        return root;
    }
}
