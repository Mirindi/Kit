package com.davidhan.kit.utils;

import android.view.View;
import android.widget.LinearLayout;

/**
 * name: ViewUtils
 * desc: Utils Library for Views
 * date: 2016-01-30
 * author: david
 * Copyright (c) 2016 David Han
 **/
public class ViewUtils {
    /**
     * Adds Margins on a child inside a linear layout. Doesnt set, just adds.
     *
     * @param view target
     * @param left   left increment
     * @param top    top increment
     * @param right  right increment
     * @param bottom bottom increment
     */
    public static void addMarginsToLinChild(View view, int left, int top, int right, int bottom) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) view.getLayoutParams();
        params.setMargins(params.leftMargin + left,
                params.topMargin + top,
                params.rightMargin + right,
                params.bottomMargin + bottom);
        view.setLayoutParams(params);
    }

    /**
     * Sets Margins on a child inside a linear layout.
     *
     * @param view   target
     * @param left   left margin
     * @param right  right margin
     * @param top    top margin
     * @param bottom bottom margin
     */
    public static void setMarginsToLinChild(View view, int left, int right, int top, int bottom) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) view.getLayoutParams();
        params.setMargins(left, top, right, bottom);
        view.setLayoutParams(params);
    }

    public static void setLeftMarginsToLinChild(View view, int amnt) {
        addMarginsToLinChild(view, amnt, 0, 0, 0);
    }
    public static void setTopMarginsToLinChild(View view, int amnt) {
        addMarginsToLinChild(view,0,amnt,0,0);
    }
    public static void setRightMarginsToLinChild(View view, int amnt) {
        addMarginsToLinChild(view,0,0,amnt,0);
    }
    public static void setBottomMarginsToLinChild(View view, int amnt) {
        addMarginsToLinChild(view,0,0,0,amnt);
    }
}
