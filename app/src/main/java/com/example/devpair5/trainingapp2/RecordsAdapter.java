package com.example.devpair5.trainingapp2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.devpair5.trainingapp2.databinding.ItemWalkRecordRowBinding;

import java.util.List;

/**
 * Created by yasminsahraoui on 13/02/2018.
 */

public class RecordsAdapter extends RecyclerView.Adapter<WalkRecordViewHolder> {

    private WalkRecordViewModel walkRecordViewModel;

    public RecordsAdapter(WalkRecordViewModel walkRecordViewModel) {
        this.walkRecordViewModel = walkRecordViewModel;
    }
    @Override
    public WalkRecordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemWalkRecordRowBinding itemBinding = ItemWalkRecordRowBinding.inflate(layoutInflater, parent, false);
        return new WalkRecordViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(WalkRecordViewHolder recordViewHolder, int position) {
        recordViewHolder.bind(walkRecordViewModel);
    }

    WalkRecordViewModel getItem(int position) {
        return walkRecordViewModel;

    }

    @Override
    public int getItemCount() {
        return 10;
    }


}
