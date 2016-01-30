package com.davidhan.kit.views;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;

import com.davidhan.kit.R;
import com.scopely.fontain.views.FontButton;

/**
 * name: PrimaryButton
 * desc: Because you cannot programtically set styles, this factory class will generate views with styles.
 * date: 2016-01-30
 * author: david
 * Copyright (c) 2016 David Han
 **/
public class StyledViewFactory {
    public static FontButton getGeneralRoundedButton(Context context){
        FontButton button = (FontButton)LayoutInflater.from(context).inflate(R.layout.view_button_general,null);
        return button;
    }
    public static FontButton getPrimaryRoundedButton(Context context){
        FontButton button = (FontButton)LayoutInflater.from(context).inflate(R.layout.view_button_general,null);
        button.setBackgroundResource(R.drawable.button_primary_rounded);
        button.setTextColor(ContextCompat.getColorStateList(context, R.color.text_primary));
        return button;
    }
}
