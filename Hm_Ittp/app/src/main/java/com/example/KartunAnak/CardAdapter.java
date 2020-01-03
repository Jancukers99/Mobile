package com.example.KartunAnak;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ListViewHolder>{
    private ArrayList<Hmj>listHmj;
    private Context context;
    public CardAdapter(Context context, ArrayList<Hmj>listHmj){
        this.listHmj=listHmj;
        this.context=context;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_hmj,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Hmj hmj=listHmj.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hmj.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(hmj.getName());
        holder.tvDesc.setText(hmj.getDescription());
        holder.cv.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                Intent detailHmj=new Intent(context, DetailListKartun.class);
                detailHmj.putExtra("hmj_id",hmj.getId());
                context.startActivity(detailHmj);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHmj.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
       ImageView imgPhoto;
       TextView tvName,tvDesc;
       CardView cv;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto=itemView.findViewById(R.id.img_hmj_list);
            tvName=itemView.findViewById(R.id.name_hmj_list);
            tvDesc=itemView.findViewById(R.id.desk);
            cv=itemView.findViewById(R.id.itemku);
        }
    }
}