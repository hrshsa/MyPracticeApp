package com.example.pc.pcapp.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.pc.pcapp.R;

/**
 * Created by HuangRuiShu on 2016/12/7.
 */
public class JumpUtils {
    public static void startActivity(Activity currentActivity, Class targetClazz, Bundle bundle) {
        if(null != currentActivity && null !=targetClazz) {
            Intent intent = new Intent(currentActivity,targetClazz);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            if(null != bundle)
                intent.putExtras(bundle);
            currentActivity.startActivity(intent);
            currentActivity.overridePendingTransition(R.anim.activity_right_in,R.anim.activity_left_out);
        }
    }
}
