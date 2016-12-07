package com.example.pc.pcapp.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.pc.pcapp.R;

/**
 * Created by HuangRuiShu on 2016/11/30.
 */
public class TopBannerView extends RelativeLayout {
    private Context context;
    private View mContentView;

    public TopBannerView(Context context) {
        super(context);
        init(context);
    }

    public TopBannerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TopBannerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        if(null == context) {
            throw new IllegalArgumentException("TopBannerView: can't create with a null context");
        }
        this.context = context;
        mContentView = LayoutInflater.from(context).inflate(R.layout.top_banner_view, null);
        addView(mContentView);
    }
}
