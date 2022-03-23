package com.example.eevs.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavAction;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.example.eevs.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textDashboard;
//        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        binding.studentAdmission.setOnClickListener(view -> {
            NavDirections action = DashboardFragmentDirections.actionNavigationDashboardToStudentAdmissionFragment();
            Navigation.findNavController(view).navigate(action);

        });

        binding.visaApplication.setOnClickListener(view -> {
            NavDirections action = DashboardFragmentDirections.actionNavigationDashboardToVisaApplicationFragment();
            Navigation.findNavController(view).navigate(action);

        });

        binding.healthInsurance.setOnClickListener(view -> {
            NavDirections action = DashboardFragmentDirections.actionNavigationDashboardToHealthInsuranceFragment();
            Navigation.findNavController(view).navigate(action);

        });

        binding.professionalYear.setOnClickListener(view -> {
            NavDirections action = DashboardFragmentDirections.actionNavigationDashboardToProfessionalYearFragment();
            Navigation.findNavController(view).navigate(action);

        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}