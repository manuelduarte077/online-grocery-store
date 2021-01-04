package com.hardsoftday.onlinegrocerystore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hardsoftday.onlinegrocerystore.R;
import com.hardsoftday.onlinegrocerystore.models.DiscountedProducts;

import java.util.List;

public class DiscountedProductAdapter extends RecyclerView.Adapter<DiscountedProductAdapter.DiscountedViewHolder> {

    Context context;
    List<DiscountedProducts> discountedProductsList;

    public DiscountedProductAdapter(Context context, List<DiscountedProducts> discountedProductsList) {
        this.context = context;
        this.discountedProductsList = discountedProductsList;
    }

    @NonNull
    @Override
    public DiscountedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.discounted_row_item, parent, false);

        return new DiscountedViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull DiscountedViewHolder holder, int position) {

        holder.discountImage.setImageResource(discountedProductsList.get(position).getImageUrl());

    }

    @Override
    public int getItemCount() {
        return 5;
    }


    public static final class DiscountedViewHolder extends RecyclerView.ViewHolder {

        ImageView discountImage;

        public DiscountedViewHolder(@NonNull View itemView) {
            super(itemView);
            discountImage = itemView.findViewById(R.id.discounted_img);
        }
    }

}
