package com.fziviello.viewPagerFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fziviello.viewPagerFragment.pages.PrimoFragment;
import com.fziviello.viewPagerFragment.pages.SecondoFragment;
import com.fziviello.viewPagerFragment.pages.TerzoFragment;

/**
 * Created by fziviello on 29/02/18.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private int NUM_PAGES = 3;
    private String[] titoliPagine = new String[]{"Prima Pagina", "Seconda Pagina","Terza Pagina"};

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // Returns totale pagine
    @Override
    public int getCount() {
        return NUM_PAGES;
    }

    //Setting Titolo Tab
    @Override
    public CharSequence getPageTitle(int position) {
        return  titoliPagine[position];
    }

    // Returns fragment da visualizzare
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PrimoFragment();
            case 1:
                return new SecondoFragment();
            case 2:
                return new TerzoFragment();
            default:
                return null;
        }
    }

}
