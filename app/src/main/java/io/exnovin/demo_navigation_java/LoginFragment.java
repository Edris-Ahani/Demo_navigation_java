package io.exnovin.demo_navigation_java;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.exnovin.demo_navigation_java.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;
    private View view;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.user.setText(LoginFragmentArgs.fromBundle(getArguments()).getUsername());
        binding.btnLogin.setOnClickListener(v -> {
            String username = binding.user.getText().toString();
            String password = binding.pass.getText().toString();
            NavDirections action =
                    LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(
                    username, password);
            Navigation.findNavController(v).navigate(action);
        });
    }
}