package com.example.doantruong.tabhost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import java.util.List;

/**
 * Created by DOANTRUONG on 1/12/2017.
 */

public class Fragment2 extends Fragment {
    CheckBox heartyItalian;
    CheckBox jalapenoCheese;
    CheckBox montereyCheddar;
    CheckBox parmesanOregano;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2_layout, container, false);

        heartyItalian = (CheckBox) view.findViewById(R.id.cbHeartyItalian);
        jalapenoCheese = (CheckBox) view.findViewById(R.id.jalapenoCheese);
        montereyCheddar = (CheckBox) view.findViewById(R.id.montereyCheddar);
        parmesanOregano = (CheckBox) view.findViewById(R.id.parmesanOregano);

        return view;
    }
}
