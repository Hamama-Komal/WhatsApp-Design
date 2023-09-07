package com.example.mywhatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mywhatsapp.databinding.CallsCardBinding;

import java.util.ArrayList;


public class CallsAdapterClass extends RecyclerView.Adapter<CallsAdapterClass.ViewHolder> {
    public CallsAdapterClass(ArrayList<CallsModelClass> list) {
        this.list = list;
    }

    ArrayList<CallsModelClass> list;

    @NonNull
    @Override
    public CallsAdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.calls_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CallsAdapterClass.ViewHolder holder, int position) {
      CallsModelClass modelClass = list.get(position);
      holder.binding.name.setText(modelClass.getName());
      holder.binding.timing.setText(modelClass.getTiming());
      holder.binding.image.setImageResource(modelClass.getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CallsCardBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CallsCardBinding.bind(itemView);
        }
    }
}
