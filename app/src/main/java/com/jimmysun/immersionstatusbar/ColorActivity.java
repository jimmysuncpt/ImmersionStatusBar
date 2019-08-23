package com.jimmysun.immersionstatusbar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        StatusBarUtils.setColor(this, getResources().getColor(R.color.colorPrimaryDark));
    }
}
