package com.balljoint.ryan.optustest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.balljoint.ryan.optustest.view.SlidingTabLayout;

public class Scen1Activity extends AppCompatActivity {

    private SlidingTabLayout mSlidingTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tabs);

    }

}
