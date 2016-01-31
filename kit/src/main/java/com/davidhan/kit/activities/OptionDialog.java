package com.davidhan.kit.activities;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.davidhan.kit.R;
import com.davidhan.kit.views.InlineItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * name: DialogActivity
 * desc:
 * date: 2015-06-26
 * author: David
 * Copyright (c) 2015 David Han
 */
public class OptionDialog extends Dialog {
    protected BaseAdapter mAdapter;
    protected ListView mListview;
    protected List<Item> mItems;

    public OptionDialog(Context context) {
        super(context);
        init();
    }

    public OptionDialog(Context context, int theme) {
        super(context, theme);
        init();
    }

    protected OptionDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        init();
    }

    public static OptionDialog newInstance(Context context, String title, ArrayList<Item> items) {
        OptionDialog dialog = new OptionDialog(context);
        dialog.setTitle(title);
        dialog.setItems(items);
        return dialog;
    }

    public void init() {
        setContentView(R.layout.activty_dialog);
        mItems = new ArrayList<>();

        mListview = (ListView) findViewById(R.id.dialog_listview);
        mAdapter = new BaseAdapter() {


            @Override
            public int getCount() {
                return mItems.size();
            }

            @Override
            public Item getItem(int i) {

                return mItems.get(i);
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(final int i, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = new InlineItem(getContext());
                }
                InlineItem inlineItem =(InlineItem) view;
                inlineItem.showChevron(false);
               inlineItem.setTitle(getItem(i).title);
               inlineItem.setValue(getItem(i).value);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getItem(i).onClickListener.onClick(view);
                        dismiss();
                    }
                });
                return view;
            }
        };
        mListview.setAdapter(mAdapter);

    }

    public void addItem(Item item) {
        mItems.add(item);
        mAdapter.notifyDataSetChanged();
    }

    public void setItems(List<Item> items) {
        this.mItems = items;
        mAdapter.notifyDataSetChanged();
    }

    public static class Item implements Serializable {
        public String title;
        public String value;
        public View.OnClickListener onClickListener;

        public Item(String title, String value, View.OnClickListener onClick) {
            this.title = title;
            this.value = value;
            this.onClickListener = onClick;
        }
    }

}
