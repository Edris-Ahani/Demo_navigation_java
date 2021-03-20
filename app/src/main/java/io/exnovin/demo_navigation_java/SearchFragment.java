package io.exnovin.demo_navigation_java;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.exnovin.demo_navigation_java.databinding.FragmentSettingsBinding;

public class SearchFragment extends Fragment {

    private FragmentSettingsBinding binding;
    private View view;

    public SearchFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSettingsBinding.inflate(inflater, container, false);
        view = binding.getRoot();
        // Inflate the layout for this fragment
        return view;
    }
}