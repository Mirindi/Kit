package com.davidhan.kit.activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.davidhan.kit.R;
import com.davidhan.kit.activities.interfaces.ISlideActivity;
import com.davidhan.kit.fragments.SlideFragment;
import com.davidhan.kit.utils.AndroidUtils;

import java.util.List;


/**
 * name: SlideDeckActivity
 * desc: A shell activity for activities that house multiple fragments such as onboarding slides, or login flows.
 * date: 2016-01-30
 * author: David
 * Copyright (c) 2015 David Han
 */
public abstract class SlideDeckActivity extends ToolbarActivity implements ISlideActivity {
    protected MultiFragmentPagerAdapter mAdapter;
    protected List<Fragment> slides;
    protected ViewPager mPager;
    protected int initCount;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initLayout();
        initSlides();
        initViews();

    }

    protected void initViews() {
        mPager = (ViewPager) findViewById(R.id.slide_deck_pager);
        mAdapter = new MultiFragmentPagerAdapter(getFragmentManager());
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }

            @Override
            public void onPageSelected(int position) {
                onNewSlideOnScreen();
                invalidateOptionsMenu();
            }
        });
        initDivider();
        mPager.setAdapter(mAdapter);
    }

    protected void onNewSlideOnScreen() {

    }

    /**
     * Inits the divider between fragments. Override this to implement custom divider.
     */
    protected void initDivider() {
        mPager.setPageMargin(AndroidUtils.dpToPx(1));
        mPager.setPageMarginDrawable(R.color.divider);
    }

    /**
     * IMPORTANT method. Override this to initialize the slides arraylist.
     */
    protected abstract void initSlides();

    /**
     * Initialize the layout. Note: if you override and use a new layout, the viewpager must have id: 'slide_deck_pager'.
     */
    @Override
    protected void initLayout() {
        setContentLayout(R.layout.activity_slidedeck);
    }


    @Override
    public void enableBackArrow(boolean visible) {
        if (visible) {
            super.setBackButton();
            getToolbar().setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goBackwards();
                }
            });
        } else {
            getToolbar().setNavigationIcon(null);
        }

    }

    private class MultiFragmentPagerAdapter extends FragmentPagerAdapter {
        public MultiFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return slides.get(i);
        }

        @Override
        public int getCount() {
            return slides.size();
        }

    }

    @Override
    public void goForwards() {
        if (mPager.getCurrentItem() < slides.size() - 2)
            mPager.setCurrentItem(mPager.getCurrentItem() + 1, true);
    }

    @Override
    public void goBackwards() {
        if (mPager.getCurrentItem() > 0)
            mPager.setCurrentItem(mPager.getCurrentItem() - 1, true);
        else onBackPressed();
    }
    @Override
    public void goToFirst() {
        skipToScreen(0);
    }

    @Override
    public void goToLast() {
        skipToScreen(slides.size());
    }

    /**
     * Skips to a screen but still animates using one slide.
     * @param index index of target slide.
     */
    @Override
    public void skipToScreen(int index) {
        if (index < mPager.getCurrentItem() - 1) {
            mPager.setCurrentItem(index + 1, false);
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        } else if (index > mPager.getCurrentItem() + 1) {
            mPager.setCurrentItem(index - 1, false);
            mPager.setCurrentItem(mPager.getCurrentItem() + 1);
        } else {
            mPager.setCurrentItem(index);
        }
    }

    public SlideFragment initWithArgs(SlideFragment slide) {
        Bundle args = new Bundle();
        args.putInt(SlideFragment.INDEX, initCount);
        initCount++;
        slide.setArguments(args);
        return slide;
    }

}

