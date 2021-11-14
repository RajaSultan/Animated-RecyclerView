package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> {

    ArrayList<Travel> travels;
    Context context;
    int lastPosition = -1;

    public AdapterClass(ArrayList<Travel> travels, Context context) {
        this.travels = travels;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.custom_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.ViewHolder holder, int position) {
        Travel travel = travels.get(position);
        holder.imageView.setImageResource(travel.getImages());
        holder.textView.setText(travel.getName());
        //binding animation to view
        setAnimation(holder.itemView, position);

    }

    @Override
    public int getItemCount() {
        return travels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView2);
            textView = itemView.findViewById(R.id.textView3);
        }
    }

    //animation for each items in recycler view
    private void setAnimation(View view, int position) {
        if (position > lastPosition) {
            Animation slideLn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            view.startAnimation(slideLn);
            lastPosition = position;
        }


    }
}
