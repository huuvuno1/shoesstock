package hou.student.shoesstock.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hou.student.shoesstock.Chitietsanpham;
import hou.student.shoesstock.R;
import hou.student.shoesstock.model.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductAdapterHolder> {
    private Context context;
    private List<Product> products;

    public ProductAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item, parent, false);
        return new ProductAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapterHolder holder, int position) {
        Product product = products.get(position);
        holder.productPrice.setText(product.getProductPrice());
        holder.productName.setText(product.getProductName());
        holder.productImage.setImageResource(product.getProductImage());
        holder.wrapLayout.setOnClickListener(v -> goToDetails(product));
        holder.productImage.setOnClickListener(v -> goToDetails(product));
    }

    private void goToDetails(Product product) {
        Intent intent = new Intent(context, Chitietsanpham.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("product_object", product);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ProductAdapterHolder extends RecyclerView.ViewHolder {
        LinearLayout wrapLayout;
        ImageButton productImage;
        TextView productName, productPrice;

        public ProductAdapterHolder(@NonNull View itemView) {
            super(itemView);
            wrapLayout = itemView.findViewById(R.id.wrap_product);
            productImage = itemView.findViewById(R.id.product_image);
            productPrice = itemView.findViewById(R.id.product_price);
            productName = itemView.findViewById(R.id.product_name);
        }
    }
}
