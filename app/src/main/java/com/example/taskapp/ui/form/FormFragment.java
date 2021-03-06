package com.example.taskapp.ui.form;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.taskapp.R;
import com.example.taskapp.databinding.FragmentFormBinding;
import com.example.taskapp.databinding.FragmentHomeBinding;

public class FormFragment extends Fragment {

       private FragmentFormBinding binding;
       private String title,description;
    public FormFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFormBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        title = binding.editTitle.getText().toString();
        description  = binding.editDescription.getText().toString();
        Toast.makeText(requireContext(), "title" + title + "description" + description,Toast.LENGTH_SHORT).show();
    }
}