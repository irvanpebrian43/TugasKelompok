package com.example.tugaskelompok;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LihatData extends AppCompatActivity {

    RecyclerView reMahasiswa;
    RecyclerView.LayoutManager layoutManager;
    List<Mahasiswa> listMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        reMahasiswa=(RecyclerView)findViewById(R.id.reDataMahasiswa);
        layoutManager=new LinearLayoutManager(LihatData.this);
        reMahasiswa.setLayoutManager(layoutManager);

        setupRecyclerView();

    }

    private void setupRecyclerView() {
        DatabaseHelper db=new DatabaseHelper(LihatData.this);
        listMahasiswa=db.selectMahasiswa();
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(LihatData.this,listMahasiswa);
        reMahasiswa.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
