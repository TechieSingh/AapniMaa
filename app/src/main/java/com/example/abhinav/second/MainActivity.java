package com.example.abhinav.second;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void fun(View v)
    {
        Intent i =new Intent(this,Third.class);
        startActivity(i);
    }

    public  void fun4(View v)
    {
        Intent i =new Intent(this,Sixth.class);
        startActivity(i);
    }
    public void  fun7(View v)
    {
        Intent i =new Intent(this,mainnn.class);
        startActivity(i);
    }

}
