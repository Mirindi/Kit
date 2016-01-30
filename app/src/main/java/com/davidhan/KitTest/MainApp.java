package com.davidhan.KitTest;

import android.app.Application;

import com.scopely.fontain.Fontain;

/**
 * name: Application
 * desc:
 * date: 2016-01-29
 * author: david
 * Copyright (c) 2016 David Han
 **/
public class MainApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fontain.init(this, "fonts", "FuturaLT");
    }


}
