package com.example.ctar_app_new;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("LOGCAT", "onCreate");
        //queue = Volley.newRequestQueue(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LOGCAT",  "onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LOGCAT", "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i( "LOGCAT", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LOGCAT", "onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LOGCAT", "onDestroy");
    }

}
