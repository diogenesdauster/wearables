package com.example.dauster.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.wear.widget.WearableLinearLayoutManager;
import android.support.wear.widget.WearableRecyclerView;

/**
 * Created by dauster on 23/10/17.
 */

public class WearableRecyclerViewActivity extends Activity {

    private WearableRecyclerView mWearableRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wearablerecyclerview);


        mWearableRecyclerView =  findViewById(R.id.recyclerview);

        mWearableRecyclerView.setEdgeItemsCenteringEnabled(true);

        mWearableRecyclerView.setAdapter(new RecyclerViewApdater());

        mWearableRecyclerView.setLayoutManager(
                new WearableLinearLayoutManager(this));


        mWearableRecyclerView.setCircularScrollingGestureEnabled(true);
        mWearableRecyclerView.setBezelFraction(0.5f);
        mWearableRecyclerView.setScrollDegreesPerScreen(90);

    }

}
