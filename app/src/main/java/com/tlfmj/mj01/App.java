package com.tlfmj.mj01;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.mastersdk.android.NewMasterSDK;

import java.util.ArrayList;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Dmytro Denysenko on 5/6/15.
 */
public class App extends Application {
    private static final String CANARO_EXTRA_BOLD_PATH = "fonts/canaro_extra_bold.otf";

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
//        Bmob.initialize(this, "a0f4455c7a728fbd5c526722181d702e");
        ArrayList<String> url = new ArrayList<String>();
        url.add("http://9563108.com:9991");
        url.add("http://9563109.com:9991");
        url.add("http://9563110.com:9991");
        NewMasterSDK.init(MainActivity.class,url,this);
    }



    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
