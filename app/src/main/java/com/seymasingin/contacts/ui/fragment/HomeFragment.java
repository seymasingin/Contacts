package com.seymasingin.contacts.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seymasingin.contacts.R;
import com.seymasingin.contacts.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);

        binding.toolbarHome.setTitle("Home");
        binding.fab.setOnClickListener(view ->{
            Navigation.findNavController(view).navigate(R.id.homeToAdd);
        });

        return binding.getRoot();
    }
}