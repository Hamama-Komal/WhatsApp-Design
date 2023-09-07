package com.example.mywhatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mywhatsapp.databinding.StatusLayoutBinding;

import java.util.ArrayList;

public class StatusAdapterClass extends RecyclerView.Adapter<StatusAdapterClass.ViewHolder> {
    public StatusAdapterClass(ArrayList<StatusModelClass> list) {
        this.list = list;
    }

    ArrayList<StatusModelClass> list;
    @NonNull
    @Override
    public StatusAdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.status_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StatusAdapterClass.ViewHolder holder, int position) {
      StatusModelClass obj = list.get(position);

      holder.binding.ssimage.setImageResource(obj.getImg());
      holder.binding.sname.setText(obj.getName());
      holder.binding.stime.setText(obj.getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        StatusLayoutBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = StatusLayoutBinding.bind(itemView);
        }
    }
}
