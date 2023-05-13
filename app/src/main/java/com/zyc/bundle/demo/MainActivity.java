package com.zyc.bundle.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zyc.bundle.annotation.WriteBundle;

public class MainActivity extends AppCompatActivity {

    @WriteBundle
    String aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}