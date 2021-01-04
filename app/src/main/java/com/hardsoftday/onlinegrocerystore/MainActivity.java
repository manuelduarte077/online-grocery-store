package com.hardsoftday.onlinegrocerystore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.onlinegrocerystore.adapter.DiscountedProductAdapter;
import com.hardsoftday.onlinegrocerystore.models.DiscountedProduct;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView;
    DiscountedProductAdapter discountedProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<DiscountedProduct> discountedProductList = new ArrayList<>();
        discountedProductList.add(new DiscountedProduct(1, R.drawable.discountberry));
        discountedProductList.add(new DiscountedProduct(2, R.drawable.discountbrocoli));
        discountedProductList.add(new DiscountedProduct(3, R.drawable.discountmeat));
        setDiscountRecycler(discountedProductList);

    }

    private void setDiscountRecycler(List<DiscountedProduct> discountedProductList) {
        discountRecyclerView = findViewById(R.id.discountRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this, discountedProductList);
        discountRecyclerView.setAdapter(discountedProductAdapter);

    }

}