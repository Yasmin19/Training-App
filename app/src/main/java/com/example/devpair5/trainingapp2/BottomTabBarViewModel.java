package com.example.devpair5.trainingapp2;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.util.Log;

/**
 * Created by yasminsahraoui on 23/01/2018.
 */

public class BottomTabBarViewModel {

    ObservableField<Color> selectedTab = new ObservableField<>();

    public BottomTabBarViewModel() {
    }

    public void onTabButtonClick(){
        //selectedTab.set(Color.parseColor());
        Log.d("test", "method successfully called");
    }
}
