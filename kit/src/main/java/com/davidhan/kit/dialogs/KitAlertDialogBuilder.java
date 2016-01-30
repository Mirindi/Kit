package com.davidhan.kit.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.davidhan.kit.R;
import com.davidhan.kit.utils.ViewUtils;
import com.davidhan.kit.views.StyledViewFactory;
import com.scopely.fontain.views.FontButton;
import com.scopely.fontain.views.FontTextView;

/**
 * name: KitAlertDialogBuilder
 * desc: An AlertDialogBuilder to override some elements.
 * date: 2016-01-30
 * author: david
 * Copyright (c) 2016 David Han
 **/
public class KitAlertDialogBuilder{
    LinearLayout.LayoutParams params;
    LinearLayout contentsContainer;
    LinearLayout actionsContainer;
    TextView titleTextView;
    Dialog dialog;
    Context context;
    int lgPadding;
    int mdPadding;
    public KitAlertDialogBuilder(Context context) {
        this.context = context;
        initVars();
        initViews();
    }

    private void initVars() {
        lgPadding = (int)context.getResources().getDimension(R.dimen.padding_lg);
        mdPadding = (int)context.getResources().getDimension(R.dimen.padding_md);
    }

    private void initViews() {
        dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.view_dialog);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.dialog_bg);

        contentsContainer = (LinearLayout) dialog.findViewById(R.id.view_dialog_content_container);
        actionsContainer = (LinearLayout) dialog.findViewById(R.id.view_dialog_actions_container);
        titleTextView = (TextView) dialog.findViewById(R.id.view_dialog_title);
        titleTextView.setVisibility(View.GONE);


    }



    public KitAlertDialogBuilder addGeneralButton(String text) {
        FontButton button = StyledViewFactory.getGeneralRoundedButton(context);
        button.setText(text);

        actionsContainer.addView(button);
        ViewUtils.setTopMarginsToLinChild(button, mdPadding);
        return this;
    }
    public KitAlertDialogBuilder addPrimaryButton(String text) {
       FontButton button = StyledViewFactory.getPrimaryRoundedButton(context);
        button.setText(text);

        actionsContainer.addView(button);
        ViewUtils.setTopMarginsToLinChild(button, mdPadding);
        return this;
    }


    public KitAlertDialogBuilder setTitle(CharSequence title) {
        titleTextView.setText(title);
        titleTextView.setVisibility(View.VISIBLE);
        return this;
    }
    public KitAlertDialogBuilder setTitle(int resId) {
        setTitle(context.getString(resId));
        return this;
    }
    public KitAlertDialogBuilder setMessage(CharSequence message){
        FontTextView messageTextView = new FontTextView(context);
        messageTextView.setText(message);
        messageTextView.setGravity(Gravity.CENTER_HORIZONTAL);
        contentsContainer.addView(messageTextView);
       // ViewUtils.setBottomMarginsToLinChild(messageTextView, regPadding);
        return this;
    }
    public KitAlertDialogBuilder setMessage(int resId){
        setMessage(context.getString(resId));
        return this;
    }
    public Dialog show(){
        dialog.show();

        return dialog;
    }
}
