package com.example.bcaguidesnepal.ui.mcq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.bcaguidesnepal.R;

public class McqFragment extends Fragment {

    private McqViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel = ViewModelProviders.of(this).get(McqViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mcq, container, false);


        return root;
    }
}