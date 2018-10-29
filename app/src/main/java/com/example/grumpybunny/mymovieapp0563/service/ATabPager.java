package com.example.grumpybunny.mymovieapp0563.service;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.grumpybunny.mymovieapp0563.function.FavoriteFragment;
import com.example.grumpybunny.mymovieapp0563.function.NowPlayingFragment;
import com.example.grumpybunny.mymovieapp0563.function.UpcomingFragment;


public class ATabPager extends FragmentPagerAdapter {

    private static final int NUM_ITEMS = 3;

    public ATabPager(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NowPlayingFragment();

            case 1:
                return new UpcomingFragment();

            case 2:
                return new FavoriteFragment();

            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
