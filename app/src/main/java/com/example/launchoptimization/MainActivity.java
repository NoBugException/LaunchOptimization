package com.example.launchoptimization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("yunchong", "===onCreate===");
        try {
            // 模拟Activity耗时操作
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("yunchong", "===onNewIntent===");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("yunchong", "===onStart===");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("yunchong", "===onRestart===");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("yunchong", "===onResume===");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("yunchong", "===onSaveInstanceState===");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("yunchong", "===onRestoreInstanceState===");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("yunchong", "===onStop===");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("yunchong", "===onDestroy===");
    }
}