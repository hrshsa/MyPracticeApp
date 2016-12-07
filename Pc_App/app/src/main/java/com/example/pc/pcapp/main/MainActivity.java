package com.example.pc.pcapp.main;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.pc.pcapp.LaunchActivity;
import com.example.pc.pcapp.R;
import com.example.pc.pcapp.base.BaseActivity;
import com.example.pc.pcapp.utils.JumpUtils;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        MainFragment fragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().
                replace(R.id.contentLL, fragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).
                commitAllowingStateLoss();

    }

    @Override
    protected boolean isHomePage() {
        return true;
    }
}
