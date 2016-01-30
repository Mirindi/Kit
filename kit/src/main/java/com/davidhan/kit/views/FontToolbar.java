package com.davidhan.kit.views;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;

import com.scopely.fontain.views.FontTextView;

/**
 * name: CustomTextViewToolbar
 * desc: A Toolbar Wrapper that uses Fontain's Custom Font TextView
 * date: 2016-01-29
 * author: david
 * Copyright (c) 2016 David Han
 **/
public class FontToolbar extends Toolbar{
    FontTextView title;

    public FontToolbar(Context context) {
        super(context);
        init();
    }

    public FontToolbar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FontToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

        title = new FontTextView(getContext());
        title.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);
        title.setGravity(Gravity.CENTER_VERTICAL);
        addView(title);
    }



    @Override
    public void setTitle(CharSequence title) {
        this.title.setText(title);
    }


    @Override
    public void setTitle(int resId) {
        title.setText(resId);
    }
}
