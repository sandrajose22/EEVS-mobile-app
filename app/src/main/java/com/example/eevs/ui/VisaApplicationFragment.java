package com.example.eevs.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eevs.R;
import com.example.eevs.databinding.FragmentStudentAdmissionBinding;
import com.example.eevs.databinding.FragmentVisaApplicationBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VisaApplicationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VisaApplicationFragment extends Fragment {

    private FragmentVisaApplicationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentVisaApplicationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnSubmit.setOnClickListener(view -> {
            BottomSheetDialog dialog = new BottomSheetDialog(getContext());
            dialog.setContentView(R.layout.bottom_sheet_enquiry);
            dialog.getBehavior().isDraggable();
            dialog.setDismissWithAnimation(true);
            dialog.show();
        });

        return root;
    }
}