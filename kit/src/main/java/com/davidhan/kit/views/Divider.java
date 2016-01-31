package com.davidhan.kit.views;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.davidhan.kit.R;
import com.davidhan.kit.boiled.BoiledView;

/**
 * name: Divider
 * desc:
 * date: 2015-06-14
 * author: David
 * Copyright (c) 2015 David Han
 */
public class Divider extends BoiledView {
    public Divider(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.list_divider));
    }
}
