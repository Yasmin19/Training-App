package com.example.devpair5.trainingapp2;

import android.databinding.BaseObservable;
import javax.inject.Inject;

/**
 * Created by yasminsahraoui on 12/12/2017.
 */

public class TrackingStatsViewModel extends BaseObservable {

    private int duration;
    private int distance;
    private int calories;
    private int heartRate;

    public TrackingStatsViewModel(int duration, int distance, int calories, int heartRate) {
        this.duration = duration;
        this.distance = distance;
        this.calories = calories;
        this.heartRate = heartRate;
    }

    public int getDuration() {
        return duration;
    }

    public int getDistance() {
        return distance;
    }

    public int getCalories() {
        return calories;
    }

    public int getHeartRate() {
        return heartRate;
    }
}
