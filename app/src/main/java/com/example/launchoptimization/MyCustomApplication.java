package com.example.launchoptimization;

import android.app.Application;

public class MyCustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            // 模拟Application耗时操作
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
