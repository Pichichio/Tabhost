package com.example.doantruong.tabhost;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener {

    ViewPager viewPager;
    TabHost tabHost;
    List<Fragment> listFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager();
        initTabHost();
    }

    private void initTabHost() {
        tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();

        String[] tabNames = {"Meal ", "Bread", "Flavor", "Cheese", "Veggies", "Sauce"};

        for (int i = 0; i < tabNames.length; i++) {
            TabHost.TabSpec tabSpec;
            tabSpec = tabHost.newTabSpec(tabNames[i]);
            tabSpec.setIndicator(tabNames[i]);
            tabSpec.setContent(new FakeContent(getApplicationContext()));
            tabHost.addTab(tabSpec);
        }
        tabHost.setOnTabChangedListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int selectedItem) {
        tabHost.setCurrentTab(selectedItem);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabChanged(String tabID) {
        int selectedItem = tabHost.getCurrentTab();
        viewPager.setCurrentItem(selectedItem);

        // Dong Phuong Bat Bai Editted here
        if (selectedItem == 5) {
            Fragment6 fragment6 = (Fragment6) listFragments.get(5);
            fragment6.orderButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    initBillingDialog(listFragments);
                }
            });
        }

        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById(R.id.h_scroll_view);
        View tabView = tabHost.getCurrentTabView();
        int scrollPos = tabView.getLeft() - (horizontalScrollView.getWidth() - tabView.getWidth()) / 2;
        horizontalScrollView.smoothScrollTo(scrollPos, 0);
    }

    private void initBillingDialog(List<Fragment> fragmentList) {
        Dialog dialog = new Dialog(MainActivity.this, android.R.style.Theme_Holo_Light_NoActionBar_Fullscreen);
        dialog.setContentView(R.layout.billing_layout);
        dialog.show();

        Fragment1 fragment1 = (Fragment1) fragmentList.get(0);
        if (fragment1.pizzaSub.isChecked()) {
            System.out.println("yes it is");
        }

        if (fragment1.subwayClub.isChecked()) {
            System.out.println("yes it is");
        }

        if (fragment1.subwayMelt.isChecked()) {
            System.out.println("yes it is");
        }
    }

    public class FakeContent implements TabHost.TabContentFactory {
        Context context;

        public FakeContent(Context mcontext) {
            context = mcontext;
        }

        @Override
        public View createTabContent(String tag) {
            View fakeView = new View(context);
            fakeView.setMinimumHeight(0);
            fakeView.setMinimumWidth(0);
            return fakeView;
        }
    }

    private void initViewPager() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        listFragments = new ArrayList<Fragment>();
        listFragments.add(new Fragment1());
        listFragments.add(new Fragment2());
        listFragments.add(new Fragment3());

        listFragments.add(new Fragment4());
        listFragments.add(new Fragment5());
        listFragments.add(new Fragment6());

        MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), listFragments);
        viewPager.setAdapter(myFragmentPagerAdapter);
        viewPager.setOnPageChangeListener(this);
    }

}