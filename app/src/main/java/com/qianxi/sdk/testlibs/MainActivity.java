package com.qianxi.sdk.testlibs;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qianxi.sdk.mesdk.MeSdk;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int add = MeSdk.getInstance().getAdd(10,10);
    }
}
