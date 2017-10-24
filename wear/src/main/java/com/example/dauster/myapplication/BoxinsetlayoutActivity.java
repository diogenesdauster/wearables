package com.example.dauster.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class BoxinsetlayoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boxinsetlayout);
    }


    public void goBack(View view){
        finish();
    }

}
