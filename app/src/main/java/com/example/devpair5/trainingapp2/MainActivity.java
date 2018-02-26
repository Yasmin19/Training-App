package com.example.devpair5.trainingapp2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.devpair5.trainingapp2.databinding.ActivityMainBinding;
import com.example.devpair5.trainingapp2.databinding.ItemWalkRecordRowBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    WalkRecordViewModel walkRecordViewModel;

    private RecyclerView recyclerView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        recyclerView = binding.walkRecordsRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecordsAdapter(walkRecordViewModel));

    }
}
