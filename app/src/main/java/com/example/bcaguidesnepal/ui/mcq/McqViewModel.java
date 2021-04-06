package com.example.bcaguidesnepal.ui.mcq;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class McqViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public McqViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}