package com.yourname.crimereportapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.yourname.crimereportapp.databinding.FragmentSecond3Binding;

public class Second3Fragment extends Fragment {

private FragmentSecond3Binding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

      binding = FragmentSecond3Binding.inflate(inflater, container, false);
      return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(v ->
                NavHostFragment.findNavController(Second3Fragment.this)
                        .navigate(R.id.action_Second3Fragment_to_First3Fragment)
        );
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}