package com.example.mywhatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mywhatsapp.databinding.ChatsCardBinding;

import java.util.ArrayList;

public class ChatsAdapterClass extends RecyclerView.Adapter<ChatsAdapterClass.ViewHolder> {

    public ChatsAdapterClass(ArrayList<ChatsModelClass> list) {
        this.list = list;
    }

    ArrayList<ChatsModelClass> list;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chats_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ChatsModelClass obj = list.get(position);

        holder.binding.name.setText(obj.getName());
        holder.binding.sms.setText(obj.getMessage());
        holder.binding.image.setImageResource(obj.getImg());
        holder.binding.time.setText(obj.getTime());

     /*   holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "Helllo", Toast.LENGTH_SHORT).show();
        });*/

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ChatsCardBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ChatsCardBinding.bind(itemView);
        }
    }
}
