package io.exnovin.demo_navigation_java;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgs;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.exnovin.demo_navigation_java.databinding.FragmentWelcomeBinding;

public class WelcomeFragment extends Fragment {

    private FragmentWelcomeBinding binding;
    private View view;

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false);
        view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.username.setText(WelcomeFragmentArgs.fromBundle(getArguments()).getUsername());
        binding.password.setText(WelcomeFragmentArgs.fromBundle(getArguments()).getPassword());
        binding.btnGoToHome.setOnClickListener(v -> {
            NavDirections action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment();
            Navigation.findNavController(v).navigate(action);
        });
    }
}