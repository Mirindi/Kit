package com.davidhan.kit.utils;

import android.content.Context;
import android.content.DialogInterface;

import com.davidhan.kit.dialogs.KitAlertDialogBuilder;

/**
 * name: CommonDialogs
 * desc: A Factory class to fetch commonly used dialogs
 * date: 2015-06-27
 * author: David
 * Copyright (c) 2015 David Han
 */
public class CommonDialogs {
    public static KitAlertDialogBuilder getNotifyDialog(Context context) {
        return new KitAlertDialogBuilder(context);
    }

    public static KitAlertDialogBuilder getConfirmDialog(Context context, DialogInterface.OnClickListener onPositiveClick) {
//
//        .setPositiveButton("Confirm", onPositiveClick)
//
//                .setNegativeButton("Deny", null)
        return new KitAlertDialogBuilder(context).addGeneralButton("Cancel").addPrimaryButton("Confirm");
    }

}
