package com.davidhan.kit.activities.interfaces;

import android.support.v7.widget.Toolbar;

/**
 * name: IMultifragmentActivity
 * desc:
 * date: 2015-06-15
 * author: David
 * Copyright (c) 2015 David Han
 */
public interface ISlideActivity {
    Toolbar getToolbar();

    void enableBackArrow(boolean visible);
    void goForwards();
    void goBackwards();
    void goToFirst();
    void goToLast();

    void skipToScreen(int index);
}
