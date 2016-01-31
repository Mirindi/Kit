package com.davidhan.kit.utils;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


/**
 * name: AnimUtils
 * desc:
 * date: 2016-01-23
 * author: david
 * Copyright (c) 2016 David Han
 **/
public class AnimUtils {
    public static Animation getAnim(Context context,int resId){
        return AnimationUtils.loadAnimation(context, resId);
    }
}
