package com.example.pc.pcapp;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.InputFilter;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import com.example.pc.pcapp.base.Env;

import java.lang.reflect.Field;

/**
 * Created by HuangRuiShu on 2016/11/30.
 */
public class MyApplication extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        getAppInfo();
        initDatas();
        initDisplayMetrics();
    }

    private void getAppInfo() {
        try {
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), 0);
            Env.packageName = info.packageName;
            Env.versionCode = info.versionCode;
            Env.versionName = info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void initDatas() {
        mContext = getApplicationContext();
    }

    private void initDisplayMetrics() {
        WindowManager manager = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        int rotation = manager.getDefaultDisplay().getRotation();
        DisplayMetrics metrics = mContext.getResources().getDisplayMetrics();
        Env.screenWidth = rotation == 0 ? metrics.widthPixels : metrics.heightPixels;
        Env.screenHeight = rotation == 0 ? metrics.heightPixels : metrics.widthPixels;
        Env.density = metrics.density;
        getStatusBarHeight();
    }

    /**
     * 通过反射获取状态栏的高度
     */
    private void getStatusBarHeight() {
        Class c = null;
        Object object = null;
        Field field = null;
        int statusBarHeight = 0;
        try {
            c = Class.forName("com.android.internal.R$dimen");
            object = c.newInstance();
            field = c.getField("status_bar_height");
            int height = Integer.parseInt(field.get(object).toString());
            statusBarHeight = this.getResources().getDimensionPixelSize(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Env.statusBarHeight = statusBarHeight;
    }
}
