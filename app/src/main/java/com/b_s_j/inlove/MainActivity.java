package com.b_s_j.inlove;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clickLogin(View view) {
        Intent intent =new Intent(this,BNV.class);
        startActivity(intent);
        finish();
    }

    public void clickLogingoogle(View view) {
        Intent intent =new Intent(this,BNV.class);
        startActivity(intent);
    }
}