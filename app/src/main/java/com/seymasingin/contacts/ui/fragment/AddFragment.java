package com.seymasingin.contacts.ui.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.seymasingin.contacts.databinding.FragmentAddBinding;

public class AddFragment extends Fragment {
    private FragmentAddBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAddBinding.inflate(inflater, container, false);

        binding.toolbarAdd.setTitle("Add");
        binding.etName.setOnClickListener(view -> {
            String etName = binding.etName.getText().toString();
            String etTel = binding.etTel.getText().toString();
            add(etName, etTel);
        });

        return binding.getRoot();
    }
    public void add(String etName, String etTel) {
        Log.e("Added", "Added");
    }
}