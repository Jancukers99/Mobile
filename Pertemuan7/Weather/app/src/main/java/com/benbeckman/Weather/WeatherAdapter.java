package com.benbeckman.Weather;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {
    private ArrayList<WeatherItems>mData=new ArrayList<>();
    public void setData(ArrayList<WeatherItems>items){
        mData.clear();
        mData.addAll(items);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.weather_items,viewGroup,false);
        return new WeatherViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder holder, int position) {
        holder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNamaKota;
        TextView Temperature;
        TextView Description;
        public WeatherViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNamaKota=itemView.findViewById(R.id.textKota);
            Temperature=itemView.findViewById(R.id.textTemp);
            Description=itemView.findViewById(R.id.textDesc);
        }
        public void bind(WeatherItems weatherItems){
            textViewNamaKota.setText(weatherItems.getName());
            Temperature.setText(weatherItems.getTemperature());
            Description.setText(weatherItems.getDescription());
        }
    }
}
