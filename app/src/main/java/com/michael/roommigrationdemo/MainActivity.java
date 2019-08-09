package com.michael.roommigrationdemo;

import android.os.Bundle;

import com.michael.roommigrationdemo.database.MyDatabase;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDatabase.getInstance(this);
    }
}
