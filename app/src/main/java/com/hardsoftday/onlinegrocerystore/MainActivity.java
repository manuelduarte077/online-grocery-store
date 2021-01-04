package com.hardsoftday.onlinegrocerystore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.onlinegrocerystore.adapter.DiscountedProductAdapter;
import com.hardsoftday.onlinegrocerystore.models.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView;
    DiscountedProductAdapter discountedProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<DiscountedProducts> discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1, R.drawable.discountberry));
        discountedProductsList.add(new DiscountedProducts(2, R.drawable.discountbrocoli));
        discountedProductsList.add(new DiscountedProducts(3, R.drawable.discountmeat));
        setDiscountRecycler(discountedProductsList);

    }

    private void setDiscountRecycler(List<DiscountedProducts> discountedProductsList) {
        discountRecyclerView = findViewById(R.id.discountRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this, discountedProductsList);
        discountRecyclerView.setAdapter(discountedProductAdapter);

    }

}