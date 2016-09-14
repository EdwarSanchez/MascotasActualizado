package com.codedwar.edwar.mascotas.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Edwar on 12/09/2016.
 */
public class PageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> listaFragment;

    public PageAdapter(FragmentManager fm, ArrayList<Fragment> listaFragment) {
        super(fm);
        this.listaFragment = listaFragment;
    }

    @Override
    public Fragment getItem(int position) {
        return listaFragment.get(position);
    }

    @Override
    public int getCount() {
        return listaFragment.size();
    }
}
