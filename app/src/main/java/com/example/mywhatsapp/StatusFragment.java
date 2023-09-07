package com.example.mywhatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mywhatsapp.databinding.FragmentStatusBinding;

import java.util.ArrayList;


public class StatusFragment extends Fragment {

    FragmentStatusBinding binding;
    ArrayList<StatusModelClass> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentStatusBinding.inflate(getLayoutInflater());
        list = new ArrayList<>();

        list.add(new StatusModelClass(R.drawable.img6,"Person1","Today 2:00 PM"));
        list.add(new StatusModelClass(R.drawable.img15,"Person2","Today 1:00 PM"));
        list.add(new StatusModelClass(R.drawable.img5,"Person3","Today 10:00 PM"));
        list.add(new StatusModelClass(R.drawable.img7,"Person4","Today 11:00 PM"));
        list.add(new StatusModelClass(R.drawable.img8,"Person5","Today 1:00 PM"));
        list.add(new StatusModelClass(R.drawable.img9,"Person6","Today 4:00 PM"));
        list.add(new StatusModelClass(R.drawable.img10,"Person7","Today 3:00 PM"));
        list.add(new StatusModelClass(R.drawable.img11,"Person8","Today 1:00 PM"));
        list.add(new StatusModelClass(R.drawable.img12,"Person9","Today 1:00 PM"));
        list.add(new StatusModelClass(R.drawable.img13,"Person10","Today 2:00 PM"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        StatusAdapterClass adapterClass = new StatusAdapterClass(list);

        binding.StatusRecycler.setLayoutManager(layoutManager);
        binding.StatusRecycler.setAdapter(adapterClass);



        return binding.getRoot();
    }
}