package com.example.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private List<ItemModel> itemModelList;

    public ItemClickListner clickListner;

    public void setClickListner(ItemClickListner myListerner){
        this.clickListner = myListerner;
    }


    public MyAdapter(List<ItemModel> itemModelList) {
        this.itemModelList = itemModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // responsible for creating new view holder for your items

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Bind the data from your dateset to the views within the view holder

        ItemModel itemModel = itemModelList.get(position);

        holder.title.setText(itemModel.itmName);
        holder.descriptions.setText(itemModel.itmDesc);
        holder.imageView.setImageResource(itemModel.itemImg);

    }

    @Override
    public int getItemCount() {
        // return the total number of item in your dataset
        return itemModelList.size();
    }


    public  class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView title, descriptions;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview);
            title = itemView.findViewById(R.id.title_txt);
            descriptions = itemView.findViewById(R.id.description_text);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            if(clickListner != null){
                clickListner.onClick(v,getAdapterPosition());
            }
        }
    }
}
