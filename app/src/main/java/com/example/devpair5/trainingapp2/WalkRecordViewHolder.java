package com.example.devpair5.trainingapp2;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.devpair5.trainingapp2.databinding.ItemWalkRecordRowBinding;


public class WalkRecordViewHolder extends RecyclerView.ViewHolder {

    private final ItemWalkRecordRowBinding dataBinding;

    public WalkRecordViewHolder(ItemWalkRecordRowBinding dataBinding) {
        super(dataBinding.getRoot());
        this.dataBinding = dataBinding;
        this.dataBinding.executePendingBindings();
    }

    public void bind(WalkRecordViewModel viewModel) {
        dataBinding.setViewModel(viewModel);
    }
}


