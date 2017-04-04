package com.bwie.test;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * 1. 类的用途
 * 2. @author dell
 * 3. @date 2017/3/27 13:55
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ZXingLibrary.initDisplayOpinion(this);
    }
}
