package com.example.dauster.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.wear.widget.WearableRecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private WearableRecyclerView mWearableRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWearableRecyclerView =  findViewById(R.id.lista);

        mWearableRecyclerView.setEdgeItemsCenteringEnabled(true);

        mWearableRecyclerView.setAdapter(new ListApdater());

        mWearableRecyclerView.setLayoutManager(
                new LinearLayoutManager(this));

    }


    private class ViewHolderList extends WearableRecyclerView.ViewHolder {

        public ViewHolderList(View itemView) {
            super(itemView);
        }
    }


    private class ListApdater extends WearableRecyclerView.Adapter<ViewHolderList> {

        String[] lista   = {"BoxInsetLayout","WearableRecyclerView"};
        Integer[] img = {R.drawable.hello,R.drawable.list};



        @Override
        public ViewHolderList onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_cruved_layout,parent,false);

            return new ViewHolderList(view);
        }

        @Override
        public void onBindViewHolder( ViewHolderList holder, final int position) {
            TextView title = holder.itemView.findViewById(R.id.text_item);
            ImageView image = holder.itemView.findViewById(R.id.image_item);

            title.setText(lista[position]);
            image.setImageResource(img[position]);

            final Context ctx = holder.itemView.getContext();

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent it = null;

                    switch (position){
                        case 0:
                            it = new Intent(ctx,BoxinsetlayoutActivity.class);
                            ctx.startActivity(it);
                            break;
                        case 1:
                            it = new Intent(ctx,WearableRecyclerViewActivity.class);
                            ctx.startActivity(it);
                            break;
                    }


                }
            });

        }

        @Override
        public int getItemCount() {
            return lista.length;
        }
    }




}
