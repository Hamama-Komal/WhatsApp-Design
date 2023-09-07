package com.example.mywhatsapp;

import android.os.Binder;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mywhatsapp.databinding.FragmentChatsBinding;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {

   FragmentChatsBinding binding;
   ArrayList<ChatsModelClass> chatsList;
   Boolean isAllFabVisible;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentChatsBinding.inflate(getLayoutInflater());


        // Floating Buttons Coding;
         binding.snap.setVisibility(View.GONE);
         binding.voice.setVisibility(View.GONE);

        isAllFabVisible = false;

        binding.messageFab.shrink();

        binding.messageFab.setOnClickListener(v -> {
            if(!isAllFabVisible){
                binding.snap.show();
                binding.voice.show();

                binding.messageFab.extend();
                isAllFabVisible = true;

            }

            else {
                binding.snap.hide();
                binding.voice.hide();

                binding.messageFab.shrink();
                isAllFabVisible = false;
            }
        });


        binding.snap.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Send a picture", Toast.LENGTH_SHORT).show();
        });

        binding.voice.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Send a voice note", Toast.LENGTH_SHORT).show();
        });

        // recycler view code

        chatsList = new ArrayList<>();

        chatsList.add(new ChatsModelClass(R.drawable.img1,"Person1","Hello..!","11:56 PM"));
        chatsList.add(new ChatsModelClass(R.drawable.img2,"Person2","How are you?","11:56 PM"));
        chatsList.add(new ChatsModelClass(R.drawable.img3,"Person3","Yup","10:56 PM"));
        chatsList.add(new ChatsModelClass(R.drawable.img4,"Person4","Are you in meeting?","10:56 PM"));
        chatsList.add(new ChatsModelClass(R.drawable.img5,"Person5","Done","10:56 PM"));
        chatsList.add(new ChatsModelClass(R.drawable.img6,"Person6","Nice","9:56 PM"));
        chatsList.add(new ChatsModelClass(R.drawable.img7,"Person7","What's going on?","8:56 PM"));
        chatsList.add(new ChatsModelClass(R.drawable.img8,"Person8","I'm Good","8:56 PM"));
        chatsList.add(new ChatsModelClass(R.drawable.img13,"Person9","Bravo..!","8:56 PM"));
        chatsList.add(new ChatsModelClass(R.drawable.img9,"Person10","Great","8:56 PM"));
        chatsList.add(new ChatsModelClass(R.drawable.img10,"Person11","Are you in meeting?","Yesterday"));
        chatsList.add(new ChatsModelClass(R.drawable.img2,"Person12","well","Yesterday"));
        chatsList.add(new ChatsModelClass(R.drawable.img12,"Person13","Okay.!","Yesterday"));
        chatsList.add(new ChatsModelClass(R.drawable.img11,"Person14","See Ya","Yesterday"));
        chatsList.add(new ChatsModelClass(R.drawable.img14,"Person15","Hi!","Yesterday"));
        chatsList.add(new ChatsModelClass(R.drawable.img15,"Person16","What's up?","Yesterday"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        ChatsAdapterClass adapterClass = new ChatsAdapterClass(chatsList);

       binding.ChatsRecycler.setLayoutManager(linearLayoutManager);
       binding.ChatsRecycler.setAdapter(adapterClass);

        return binding.getRoot();
    }
}