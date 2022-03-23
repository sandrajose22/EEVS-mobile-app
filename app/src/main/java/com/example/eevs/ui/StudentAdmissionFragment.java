package com.example.eevs.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.NavigationUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eevs.R;
import com.example.eevs.databinding.FragmentContactBinding;
import com.example.eevs.databinding.FragmentStudentAdmissionBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class StudentAdmissionFragment extends Fragment {

    private FragmentStudentAdmissionBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_student_admission, container, false);

        binding = FragmentStudentAdmissionBinding.inflate(inflater, container, false);
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