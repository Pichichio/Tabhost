package com.example.doantruong.tabhost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by DOANTRUONG on 1/13/2017.
 */

public class Fragment6 extends Fragment {
    Button orderButton;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment6_layout, container, false);
        orderButton = (Button) view.findViewById(R.id.orderButton);

        return view;
    }
}

