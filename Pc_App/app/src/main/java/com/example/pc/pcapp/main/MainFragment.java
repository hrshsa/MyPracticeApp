package com.example.pc.pcapp.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pc.pcapp.R;

/**
 * Created by HuangRuiShu on 2016/12/7.
 */
public class MainFragment extends BaseFragment {

    private FragmentTabHost mTabHost;
    private View mContentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mContentView == null) {
            mContentView = inflater.inflate(R.layout.main_fragment, null);
            initView(mContentView);
        } else {
            ViewGroup parent = (ViewGroup) mContentView.getParent();
            if (parent != null) {
                parent.removeView(mContentView);
            }
        }
        return mContentView;
    }

    private void initView(View mContentView) {
        mTabHost = (FragmentTabHost) mContentView.findViewById(android.R.id.tabhost);
        mTabHost.setup(getActivity(),getChildFragmentManager(),R.id.main_content);
    }


}
