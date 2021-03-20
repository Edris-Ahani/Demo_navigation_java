package io.exnovin.demo_navigation_java;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.exnovin.demo_navigation_java.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private View view;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnGoToLogin.setOnClickListener(v -> {
            //change destination
            NavDirections action = HomeFragmentDirections.actionHomeFragmentToLoginFragment();
            Navigation.findNavController(v).navigate(action);

        });
        binding.btnGoToSearch.setOnClickListener(v -> {
            //first way
            NavDirections action = HomeFragmentDirections.actionHomeFragmentToSearchFragment();
            Navigation.findNavController(v).navigate(action);
            //second way
            //Navigation.findNavController(v).navigate(R.id.searchFragment);
        });
    }
}