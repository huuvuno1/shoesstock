package hou.student.shoesstock.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hou.student.shoesstock.R;
import hou.student.shoesstock.chitiettips;
import hou.student.shoesstock.model.SuggestProducts;

public class GoiYAdapter extends RecyclerView.Adapter<GoiYAdapter.GoiYAdapterHolder> {
    private Context context;
    private List<SuggestProducts> suggestProducts;

    public GoiYAdapter(Context context, List<SuggestProducts> suggestProducts) {
        this.context = context;
        this.suggestProducts = suggestProducts;
    }

    @NonNull
    @Override
    public GoiYAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_goiy, parent, false);
        return new GoiYAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GoiYAdapterHolder holder, int position) {
        SuggestProducts suggestProducts = this.suggestProducts.get(position);
        holder.textTitle.setText(suggestProducts.getTitle());
        holder.imageView.setImageResource(suggestProducts.getImage());
        holder.cardView.setOnClickListener(v -> {
            Intent intent = new Intent(context, chitiettips.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("goiy_object", suggestProducts);
            intent.putExtras(bundle);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return suggestProducts.size();
    }

    public class GoiYAdapterHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView textTitle;
        ImageView imageView;

        public GoiYAdapterHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.tips);
            textTitle = itemView.findViewById(R.id.textView21);
            imageView = itemView.findViewById(R.id.imageView2);
        }
    }
}
