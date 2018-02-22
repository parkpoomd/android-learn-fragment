package com.example.deer.learnfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by deer on 22/2/2018 AD.
 */

public class MyPageAdapter extends FragmentPagerAdapter {
    private final int NUM_ITEMS = 3;

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return OneFragment.newInstance();
        } else if (position == 1) {
            return TwoFragment.newInstance();
        } else if (position == 2) {
            return ThreeFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
