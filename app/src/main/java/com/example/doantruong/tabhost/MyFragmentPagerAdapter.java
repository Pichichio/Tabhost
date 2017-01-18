package com.example.doantruong.tabhost;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by DOANTRUONG on 1/12/2017.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> listFragments;

    public MyFragmentPagerAdapter(FragmentManager fragmentManager, List<Fragment> listFragments) {
        super(fragmentManager);
        this.listFragments = listFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return listFragments.get(position);
    }

    @Override
    public int getCount() {
        return listFragments.size();
    }

}
