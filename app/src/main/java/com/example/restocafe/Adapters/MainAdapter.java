package com.example.restocafe.Adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restocafe.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder>{

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView foodimage;
        TextView mainName,dishPrice, DishDesc;


         public viewholder(@NonNull View itemView) {
            super(itemView);

            foodimage = itemView.findViewById(R.id.imageViewDish);
             mainName = itemView.findViewById(R.id.textViewDish);
             dishPrice = itemView.findViewById(R.id.textViewPrice);
             DishDesc = itemView.findViewById(R.id.textViewDesc);

        }
    }

}
