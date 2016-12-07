package com.example.pc.pcapp.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.example.pc.pcapp.R;

/**
 * Created by HuangRuiShu on 2016/11/30.
 * The base class of all activity
 * used to set the TopBanner and set the night mode
 */
public abstract class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_layout);
    }

    //    @Override
//    public void onBackPressed() {
//        if(isHomePage()) {
//
//        } else {
//            Log.d("当前关闭的是：" , this.getClass().getSimpleName());
//            this.finish();
//            this.overridePendingTransition(R.anim.activity_left_in, R.anim.activity_right_out);
//        }
//    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void finish() {
        super.finish();
    }

    protected abstract boolean isHomePage();
}
