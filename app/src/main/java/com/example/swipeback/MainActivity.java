package com.example.swipeback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.swipeback.activity.DispatchManagerActivity;

public class MainActivity extends AppCompatActivity {
    public static int Page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onApplication(View v) {
        Page = 1;
        startActivity(new Intent(this, DispatchManagerActivity.class));
    }

}
