package com.davidhan.kit.views;

import android.content.Context;

import com.davidhan.kit.R;
import com.davidhan.kit.boiled.BoiledView;
import com.davidhan.kit.utils.AndroidUtils;

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
        setBackground(AndroidUtils.getDrawable(getContext(), R.drawable.list_divider));
    }
}
