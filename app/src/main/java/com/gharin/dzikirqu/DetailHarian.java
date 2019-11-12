package com.gharin.dzikirqu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailHarian extends AppCompatActivity {
    String idHarian;

    public static final String KEY_HARIAN = "KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_harian);

        idHarian = getIntent().getStringExtra(KEY_HARIAN);
    }
}
