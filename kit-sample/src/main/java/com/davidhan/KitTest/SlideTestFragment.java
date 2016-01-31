package com.davidhan.KitTest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.davidhan.kit.fragments.SlideFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * name: MultiFragmentTestFragment
 * desc:
 * date: 2016-01-30
 * author: david
 * Copyright (c) 2016 David Han
 **/
public class SlideTestFragment extends SlideFragment {
    @Bind(R.id.slide_test_index)
    TextView slideIndex;
    @Bind(R.id.slide_test_to_first)
    Button mToFirst;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        ButterKnife.bind(this, getView());
        slideIndex.setText("SLIDE " + index);

        mToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deckParent.skipToScreen(0);
            }
        });
    }

    @Override
    public String toString() {
        return String.valueOf(index);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slide_test,container,false);
    }
}
