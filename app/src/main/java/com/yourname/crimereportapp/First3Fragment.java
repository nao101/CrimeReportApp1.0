package com.yourname.crimereportapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.yourname.crimereportapp.databinding.FragmentFirst3Binding;

public class First3Fragment extends Fragment {

private FragmentFirst3Binding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

      binding = FragmentFirst3Binding.inflate(inflater, container, false);
      return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(v ->
                NavHostFragment.findNavController(First3Fragment.this)
                        .navigate(R.id.action_First3Fragment_to_Second3Fragment)
        );
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}