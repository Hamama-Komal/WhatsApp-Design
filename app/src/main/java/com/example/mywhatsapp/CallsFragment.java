package com.example.mywhatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mywhatsapp.databinding.FragmentCallsBinding;

import java.util.ArrayList;

public class CallsFragment extends Fragment {

    FragmentCallsBinding binding;
    ArrayList<CallsModelClass> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentCallsBinding.inflate(getLayoutInflater());
        list = new ArrayList<>();

        list.add(new CallsModelClass(R.drawable.img15, "Person1", "Today, 3:00 AM"));
        list.add(new CallsModelClass(R.drawable.img3, "Person2", "Today, 2:00 AM"));
        list.add(new CallsModelClass(R.drawable.img13, "Person3", "Today, 1:00 AM"));
        list.add(new CallsModelClass(R.drawable.img12, "Person4", "Today, 11:00 AM"));
        list.add(new CallsModelClass(R.drawable.img4, "Person5", "Today, 12:00 AM"));
        list.add(new CallsModelClass(R.drawable.img14, "Person6", "Yesterday, 1:00 AM"));
        list.add(new CallsModelClass(R.drawable.img7, "Person7", "Yesterday, 10:00 AM"));
        list.add(new CallsModelClass(R.drawable.img6, "Person8", "Yesterday, 10:00 AM"));
        list.add(new CallsModelClass(R.drawable.img9, "Person9", "10 August, 10:00 AM"));
        list.add(new CallsModelClass(R.drawable.img10, "Person10", "10 August, 10:00 AM"));
        list.add(new CallsModelClass(R.drawable.img15, "Person1", "Today, 3:00 AM"));
        list.add(new CallsModelClass(R.drawable.img3, "Person2", "Today, 2:00 AM"));
        list.add(new CallsModelClass(R.drawable.img13, "Person3", "Today, 1:00 AM"));
        list.add(new CallsModelClass(R.drawable.img12, "Person4", "Today, 11:00 AM"));
        list.add(new CallsModelClass(R.drawable.img4, "Person5", "Today, 12:00 AM"));
        list.add(new CallsModelClass(R.drawable.img14, "Person6", "Yesterday, 1:00 AM"));
        list.add(new CallsModelClass(R.drawable.img7, "Person7", "Yesterday, 10:00 AM"));
        list.add(new CallsModelClass(R.drawable.img6, "Person8", "Yesterday, 10:00 AM"));
        list.add(new CallsModelClass(R.drawable.img9, "Person9", "10 August, 10:00 AM"));
        list.add(new CallsModelClass(R.drawable.img10, "Person10", "10 August, 10:00 AM"));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        CallsAdapterClass adapterClass = new CallsAdapterClass(list);

        binding.CallsRecycler.setLayoutManager(linearLayoutManager);
        binding.CallsRecycler.setAdapter(adapterClass);


        return binding.getRoot();
    }
}