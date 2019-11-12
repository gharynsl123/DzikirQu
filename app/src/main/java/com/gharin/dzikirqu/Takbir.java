package com.gharin.dzikirqu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Takbir extends AppCompatActivity {

    TextView tvDigit, tvSelesai;
    Button btnPress, btnReset;
    private int tambahAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takbir);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        tvDigit = findViewById(R.id.tv_digit1);
        tvSelesai = findViewById(R.id.btn_selesai);
        btnPress = findViewById(R.id.btn_press1);
        btnReset = findViewById(R.id.btn_reset2);
        getSupportActionBar().setTitle("Takbir");

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahAngka = 0;
                tvDigit.setText(String.valueOf(tambahAngka));
            }
        });



        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvDigit.setText(String.valueOf(tambahAngka));
                if (tambahAngka >= 33){
                    tvSelesai.setVisibility(View.VISIBLE);
                }else{
                    tambahAngka = tambahAngka+1;
                    tvSelesai.setVisibility(View.GONE);
                }
                tvDigit.setText(String.valueOf(tambahAngka));
            }
        });
    }
}
