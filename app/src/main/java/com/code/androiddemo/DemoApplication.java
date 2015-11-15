package com.code.androiddemo;

import android.app.Application;

import com.socks.library.KLog;

/**
 * 自定义application
 * Created by gan on 2015/11/15.
 */
public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KLog.init(BuildConfig.LOG_DEBUG);
    }
}
