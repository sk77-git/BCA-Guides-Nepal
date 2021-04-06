package com.example.bcaguidesnepal.ui.notices;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.bcaguidesnepal.R;

public class NoticesFragment extends Fragment {

    private NoticesViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(NoticesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notices, container, false);
        return root;
    }
}