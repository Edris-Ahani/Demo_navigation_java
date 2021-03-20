package io.exnovin.demo_navigation_java;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.exnovin.demo_navigation_java.databinding.FragmentTermsBinding;

public class TermsFragment extends Fragment {

    private FragmentTermsBinding binding;
    private View view;

    public TermsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTermsBinding.inflate(inflater, container, false);
        view = binding.getRoot();
        return view;
    }
}