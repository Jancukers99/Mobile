package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHmAdapter extends RecyclerView.Adapter<ListHmAdapter.ListViewHolder> {
    private ArrayList<Hmj>listHmj;
    public ListHmAdapter(ArrayList<Hmj>list){
        this.listHmj=list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.runtah,viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListHmAdapter.ListViewHolder holder, int position) {
        Hmj hmj =listHmj.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hmj.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(hmj.getName());
        holder.tvDesc.setText(hmj.getDescription());
    }
    public int getItemCount() {
        return listHmj.size();
    }

   class ListViewHolder extends RecyclerView.ViewHolder{
TextView tvName,tvDesc;
ImageView imgPhoto;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto =itemView.findViewById(R.id.img_item_photo);
            tvDesc =itemView.findViewById(R.id.tv_desc);
            tvName=itemView.findViewById(R.id.tv_ireng);
        }
    }
    }

