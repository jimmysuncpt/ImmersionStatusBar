package com.jimmysun.immersionstatusbar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TransparentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent);
        StatusBarUtils.setTransparent(this);
    }
}
