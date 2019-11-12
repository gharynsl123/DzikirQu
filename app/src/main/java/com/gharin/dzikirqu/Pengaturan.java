package com.gharin.dzikirqu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gharin.dzikirqu.Adapter.AdapterDzikir;
import com.gharin.dzikirqu.Adapter.AdapterPengaturan;
import com.gharin.dzikirqu.Model.ModelDzikir;
import com.gharin.dzikirqu.Model.ModelPengaturan;

import java.util.ArrayList;

public class Pengaturan extends AppCompatActivity {
    private AdapterPengaturan adapterPengaturan;
    RecyclerView rvMainPagipetang;
    ArrayList<ModelPengaturan> arrayList;

    private String[] idPenngaturan = {
            "1",
            "1",
            "1",
            "1",
            "1",
            "1",
    };


    private String[] tvjudul = {
            "1",
            "1",
            "1",
            "1",
            "1",
            "1",
    };
    private String[] tvKeterangan = {
            "1",
            "1",
            "1",
            "1",
            "1",
            "1",
    };
    private int[] ivpengaturan = {
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);
        setTitle("Pengaturan");
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        rvMainPagipetang= findViewById(R.id.rvMainPengatru);
        arrayList = new ArrayList<>();
        adapterPengaturan = new AdapterPengaturan(arrayList);
        setDataPagi();
        rvMainPagipetang.setAdapter(adapterPengaturan);
        rvMainPagipetang.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setDataPagi() {
        int count = 0;
        for (String id : idPenngaturan) {
            arrayList.add(new ModelPengaturan(id, tvjudul[count], tvKeterangan[count], ivpengaturan[count]));
            count++;

        }
    }
}
