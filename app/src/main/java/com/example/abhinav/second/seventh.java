package com.example.abhinav.second;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class seventh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
    }

    public  void fun6(View v)
    {
        Intent i =new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
