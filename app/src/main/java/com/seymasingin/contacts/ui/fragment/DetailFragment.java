package com.seymasingin.contacts.ui.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.seymasingin.contacts.data.model.Person;
import com.seymasingin.contacts.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {
    private FragmentDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDetailBinding.inflate(inflater, container, false);

        binding.toolbarDetail.setTitle("Detail");

        DetailFragmentArgs bundle = DetailFragmentArgs.fromBundle(getArguments());
        Person person = bundle.getPerson();

        binding.etName.setText(person.getPerson_name());
        binding.etTel.setText(person.getPerson_tel());
        binding.buttonRefresh.setOnClickListener(view -> {
            String etName = binding.etName.getText().toString();
            String etTel = binding.etTel.getText().toString();
            refresh(person.getPerson_id(), person.getPerson_name(), person.getPerson_tel());
        });

        return binding.getRoot();
    }

    public void refresh(int person_id, String person_name, String person_tel) {
        Log.e("added", "added");
    }
}