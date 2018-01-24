package com.example.devpair5.trainingapp2;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.devpair5.trainingapp2.databinding.FragmentBottomTabBarBinding;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class BottomTabBarFragment extends Fragment {

    //Injecting the view model into the fragment
    @Inject
    BottomTabBarViewModel bottomTabBarViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        FragmentBottomTabBarBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bottom_tab_bar, container, false);
        binding.setViewModel(bottomTabBarViewModel);
        return binding.getRoot();
    }

    @Override
    public void onAttach(Context context){
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

}
