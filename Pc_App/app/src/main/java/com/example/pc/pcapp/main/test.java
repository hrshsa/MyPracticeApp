package com.example.pc.pcapp.main;

import android.os.Bundle;

import com.example.pc.pcapp.R;
import com.example.pc.pcapp.base.BaseActivity;

/**
 * Created by HuangRuiShu on 2016/12/7.
 */
public class test extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected boolean isHomePage() {
        return false;
    }
}
