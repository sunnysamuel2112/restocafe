package com.example.restocafe.Adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restocafe.R;

public class MainAdapter {

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
