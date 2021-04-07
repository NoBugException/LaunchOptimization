package com.example.launchoptimization;

import android.app.Application;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;

import java.io.File;

public class MyCustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

//        File file = new File(Environment.getExternalStorageDirectory(), "MyCustomApplication.trace");
//        Log.d("TAG", "file:" + file.getAbsolutePath());
//        //把分析结果存在一个文件
//        Debug.startMethodTracing(file.getAbsolutePath());
//
//        for (int i=0; i < 10000; i++) {
//            Log.d("yunchong", "===== onCreate ====");
//        }
//
//        Debug.stopMethodTracing();

//        try {
//            // 模拟Application耗时操作
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        Debug.stopMethodTracing();
    }
}
