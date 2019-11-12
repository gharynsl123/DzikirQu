package com.gharin.dzikirqu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gharin.dzikirqu.Adapter.AdapterDzikirLain;
import com.gharin.dzikirqu.Adapter.AdapterHarian;
import com.gharin.dzikirqu.Adapter.AdapterSetelahShalat;
import com.gharin.dzikirqu.Model.ModelHarian;
import com.gharin.dzikirqu.Model.ModelSetelahShalat;

import java.util.ArrayList;

public class DoaHarian extends AppCompatActivity {
    private AdapterHarian adapterHarian;
    RecyclerView rvMainHarian;
    ArrayList<ModelHarian> arrayList;

    private String[] idHarian= {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
    };
    private String[] tvHarian = {
            "Harian Satu",
            "Harian Dua",
            "Harian tiga",
            "Harian empat",
            "Harian lima",
            "Harian enam",
            "Harian tujuh",
            "Harian lapan",
            "Harian sempilan",
            "Harian sepuluh"
    };
    private int[] ivHarian = {
            R.drawable.harian,
            R.drawable.harian,
            R.drawable.harian,
            R.drawable.harian,
            R.drawable.harian,
            R.drawable.harian,
            R.drawable.harian,
            R.drawable.harian,
            R.drawable.harian,
            R.drawable.harian,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_harian);
        setTitle("Doa Harian");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        rvMainHarian= findViewById(R.id.rvMainHarian);
        arrayList = new ArrayList<>();
        adapterHarian = new AdapterHarian(arrayList);
        setDataHarian();
        rvMainHarian.setAdapter(adapterHarian);
        rvMainHarian.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setDataHarian() {
        int count = 0;
        for (String id : idHarian) {
            arrayList.add(new ModelHarian(id, tvHarian[count], ivHarian[count]));
            count++;

        }
    }
}
