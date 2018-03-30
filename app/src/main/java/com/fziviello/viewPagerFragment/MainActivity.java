package com.fziviello.viewPagerFragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.fziviello.viewPagerFragment.R;

/**
 * Created by fziviello on 29/02/18.
 */

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    PagerAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager_activity);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);
    }
}
