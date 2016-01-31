package com.davidhan.KitTest;

import android.os.Bundle;

import com.davidhan.kit.activities.SlideDeckActivity;

import java.util.ArrayList;

public class SlideDeckTestActvitiy extends SlideDeckActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableBackArrow(true);
    }

    @Override
    protected void initSlides() {
        slides = new ArrayList<>();
        slides.add(initWithArgs(new SlideTestFragment()));
        slides.add(initWithArgs(new SlideTestFragment()));
        slides.add(initWithArgs(new SlideTestFragment()));
        slides.add(initWithArgs(new SlideTestFragment()));
        slides.add(initWithArgs(new SlideTestFragment()));

    }

}
