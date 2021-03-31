package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview.R;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.rv_mahasiswa);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dwi Rifki Novianto", "E41191107", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Hendy", "E41191280", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Dewi", "E41190860", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fajar", "E41192090", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Ardan", "E41192010", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Zamik", "E41193010", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Tegar", "E41194509", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Bintang", "E41194509", "123456789"));
    }
}