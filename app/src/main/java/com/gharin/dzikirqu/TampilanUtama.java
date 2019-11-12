package com.gharin.dzikirqu;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TampilanUtama extends AppCompatActivity {

    TextView tvTanggal, tvNameUser, tvHari;

    ImageView ivUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_utama);

        tvTanggal = findViewById(R.id.tvCalender);
        tvHari = findViewById(R.id.tvHari);
        tvNameUser = findViewById(R.id.tvNameUser);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, dd MMM yyy");
        tvTanggal.setText(simpleDateFormat.format(new Date()));

        Calendar calendar = Calendar.getInstance();
        int time = calendar.get(Calendar.HOUR_OF_DAY);

        if (time >= 1 && time <= 10) {
            tvHari.setText(getString(R.string.Pagi));
        } else if (time >= 11 && time <= 15) {
            tvHari.setText(getString(R.string.siang));
        } else if (time >= 16 && time <= 18) {
            tvHari.setText(getString(R.string.Sore));
        } else if (time >= 19 && time <= 24) {
            tvHari.setText(getString(R.string.Malam));
        }

    }

    public void pagi(View view) {
        startActivity(new Intent(TampilanUtama.this, Pagi.class));
    }

    public void sore(View view) {
        startActivity(new Intent(TampilanUtama.this, Petang.class));
    }

    public void setelahSholat(View view) {
        startActivity(new Intent(TampilanUtama.this, SetelahSholat.class));
    }

    public void harian(View view) {
        startActivity(new Intent(TampilanUtama.this, DoaHarian.class));
    }

    public void lainnya(View view) {
        startActivity(new Intent(TampilanUtama.this, DzikirLain.class));
    }

    public void pengaturan(View view) {
        startActivity(new Intent(TampilanUtama.this, Pengaturan.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pengaturan, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.openBrowser:
                startActivity(new Intent(TampilanUtama.this, Pengaturan.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}