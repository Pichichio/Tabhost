package com.example.doantruong.tabhost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

/**
 * Created by DOANTRUONG on 1/12/2017.
 */

public class Fragment1 extends Fragment {
    CheckBox pizzaSub;
    CheckBox subwayClub;
    CheckBox subwayMelt;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1_layout, container, false);
        pizzaSub = (CheckBox) view.findViewById(R.id.rdbPizzaSub);
        subwayClub = (CheckBox) view.findViewById(R.id.rdbSubwayClub);
        subwayMelt = (CheckBox) view.findViewById(R.id.rdbSubwayMelt);

        return view;
    }
}
