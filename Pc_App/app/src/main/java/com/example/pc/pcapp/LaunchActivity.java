package com.example.pc.pcapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pc.pcapp.base.BaseActivity;
import com.example.pc.pcapp.main.MainActivity;
import com.example.pc.pcapp.utils.JumpUtils;

public class LaunchActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_view);
    }

    public void click(View view) {
        JumpUtils.startActivity(LaunchActivity.this, MainActivity.class,null);
        finish();
    }

    @Override
    protected boolean isHomePage() {
        return false;
    }
}
