package com.example.abhinav.second;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sixth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
    }

    public  void fun5(View v)
    {
        Intent i =new Intent(this,seventh.class);
        startActivity(i);
    }
}
