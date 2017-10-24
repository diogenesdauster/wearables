package com.example.dauster.myapplication;

import android.content.Context;
import android.support.wear.widget.WearableRecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by dauster on 08/10/17.
 */

public class RecyclerViewApdater extends WearableRecyclerView.Adapter<ViewHolderRecyclerView> {

    String[] lista   = {"Item 1","Item 2","Item 3","Item 4","Item 5"};

    @Override
    public ViewHolderRecyclerView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cruved_layout,parent,false);

        return new ViewHolderRecyclerView(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderRecyclerView holder, final int position) {

        final Context ctx = holder.itemView.getContext();

        TextView title = holder.itemView.findViewById(R.id.text_item);
        ImageView image = holder.itemView.findViewById(R.id.image_item);

        title.setText(lista[position]);
        image.setImageResource(holder.itemView.getResources().getIdentifier("account","drawable",ctx.getPackageName()));


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx,lista[position],Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return lista.length;
    }
}
