package com.gharin.dzikirqu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gharin.dzikirqu.Adapter.AdapterDzikir;
import com.gharin.dzikirqu.Adapter.AdapterDzikirLain;
import com.gharin.dzikirqu.Model.ModelDzikir;
import com.gharin.dzikirqu.Model.ModelDzikirLain;

import java.util.ArrayList;

public class DzikirLain extends AppCompatActivity {
    private AdapterDzikirLain adapterDzikirLain;
    RecyclerView rvMainDzikirLain;
    ArrayList<ModelDzikirLain> arrayList;
    private String[] tvidList = {
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
            "11",
    };

    private int[] ivLauncher = {
            R.drawable.isis,
            R.drawable.isis,
            R.drawable.isis,
            R.drawable.isis,
            R.drawable.isis,
            R.drawable.isis,
            R.drawable.isis,
            R.drawable.isis,
            R.drawable.isis,
            R.drawable.isis,
            R.drawable.isis,

    };

    private String[] tvList = {
            "Gambar satu",
            "gambar dua",
            "gambar tiga",
            "gambar empat",
            "gambar lima",
            "gambar enam",
            "gambar tujuh",
            "gambar lapan",
            "gambar sembila",
            "gambar aepuluh",
            "gamabr 11",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_lain);
        setTitle("Dzikir Lainnya");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        rvMainDzikirLain = findViewById(R.id.rvMaiDzikirLain);
        arrayList = new ArrayList<>();
        adapterDzikirLain = new AdapterDzikirLain(arrayList);
        setDataPagi();
        rvMainDzikirLain.setAdapter(adapterDzikirLain);
        rvMainDzikirLain.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setDataPagi() {
        int count = 0;
        for (String id : tvidList) {
            arrayList.add(new ModelDzikirLain(id, tvList[count], ivLauncher[count]));
            count++;

        }

    }
}
