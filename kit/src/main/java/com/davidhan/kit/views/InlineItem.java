package com.davidhan.kit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.davidhan.kit.R;
import com.davidhan.kit.boiled.BoiledLinearLayout;
import com.davidhan.kit.utils.ViewUtils;

/**
 * name: InlineItem
 * desc: Reusable for list items. Note: Comes with negative containerpadding margins.
 * date: 2017-01-30
 * author: David
 * Copyright (c) 2015 David Han
 */
public class InlineItem extends BoiledLinearLayout {
    TextView mTitle;
    TextView mValue;
    ImageView mChevron;
     View mDivider;

    public InlineItem(Context context) {
        super(context);
        inflateLayout();
        init();
    }

    public InlineItem(Context context, AttributeSet attrs) {
        super(context, attrs);

        inflateLayout();
        init();
        initAttrs(attrs);
    }

    public InlineItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        inflateLayout();
        init();
        initAttrs(attrs);
    }

    private void initAttrs(AttributeSet attrs) {
        TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.InlineItem, 0, 0);
        try {
            boolean showChevron = ta.getBoolean(R.styleable.InlineItem_chevron, false);
            boolean showDivider = ta.getBoolean(R.styleable.InlineItem_show_divider, false);
            String titleText = ta.getString(R.styleable.InlineItem_title_text);
            String valueText = ta.getString(R.styleable.InlineItem_value_text);
            if(titleText != null)mTitle.setText(titleText);
            if(valueText != null)mValue.setText(valueText);
            mValue.setVisibility(valueText == null || valueText.isEmpty() ? GONE : VISIBLE);
            mChevron.setVisibility(showChevron ? VISIBLE : GONE);
            mDivider.setVisibility(showDivider ? VISIBLE : GONE);
        } finally {
            ta.recycle();
        }
    }

    protected void init() {

        mTitle = (TextView) getRootView().findViewById(R.id.inline_item_title);
        mValue = (TextView) getRootView().findViewById(R.id.inline_item_value);
        mChevron = (ImageView) getRootView().findViewById(R.id.inline_item_chevron);
        mDivider =  getRootView().findViewById(R.id.inline_item_bottom_divider);

    }

    @Override
    protected void onAttachedToWindow() {
        ViewUtils.setLeftMarginsToLinChild(this,(int)getResources().getDimension(R.dimen.neg_container_padding));
        ViewUtils.setRightMarginsToLinChild(this, (int) getResources().getDimension(R.dimen.neg_container_padding));
        super.onAttachedToWindow();
    }

    private void inflateLayout() {
        setContentView(R.layout.view_inline_item);
    }

    public void showChevron(boolean show) {
        mChevron.setVisibility(show ? VISIBLE : GONE);
    }

    public void setTitle(String title) {
        mTitle.setText(title);
    }

    public void setValue(String value) {
        mValue.setText(value);
    }
}
