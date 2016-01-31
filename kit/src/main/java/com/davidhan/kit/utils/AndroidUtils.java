package com.davidhan.kit.utils;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * name: AndroidUtils
 * desc:
 * date: 2015-06-14
 * author: David
 * Copyright (c) 2015 David Han
 */
public class AndroidUtils {
    public static int dpToPx(float dp){
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return Math.round(px);
    }
}
