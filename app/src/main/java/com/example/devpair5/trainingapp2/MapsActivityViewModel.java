package com.example.devpair5.trainingapp2;

import java.sql.Time;
import java.util.Observable;

import javax.inject.Inject;

/**
 * Created by yasminsahraoui on 08/12/2017.
 */

public class MapsActivityViewModel {

    // TODO: 12/12/2017 - This view model should deal with locations? location providers  
    
    private final MapsActivityViewModel mapViewModel;
    // TODO: 12/12/2017 - Add list of markers if needed? Starting point to destination point??
    
    @Inject
    public MapsActivityViewModel(MapsActivityViewModel mapViewModel){
        this.mapViewModel = mapViewModel;
    }

}
