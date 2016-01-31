package com.davidhan.kit.fragments;

import android.app.Fragment;
import android.os.Bundle;

import com.davidhan.kit.activities.interfaces.ISlideActivity;

/**
 * name: MultiFragActiFragment
 * desc: A Fragment to be used on MultiFragmentActivity.
 * date: 2015-06-15
 * author: David
 * Copyright (c) 2015 David Han
 */
public abstract class SlideFragment extends Fragment {
    public static String INDEX ="index";
    protected ISlideActivity deckParent;
    protected int index;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        deckParent = (ISlideActivity) getActivity();
        index = getArguments().getInt(INDEX);
        super.onActivityCreated(savedInstanceState);
    }
    public int getUniqueId(){
        return index;
    }



}
