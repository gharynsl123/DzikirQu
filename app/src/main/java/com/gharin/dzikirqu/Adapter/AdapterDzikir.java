package com.gharin.dzikirqu.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gharin.dzikirqu.Model.ModelDzikir;
import com.gharin.dzikirqu.R;

import java.util.ArrayList;

public class AdapterDzikir extends RecyclerView.Adapter<AdapterDzikir.DzikirHolder> {
    ArrayList<ModelDzikir> listDzikir;

    public AdapterDzikir(ArrayList<ModelDzikir> listDzikir) {
        this.listDzikir = listDzikir;
    }

    @NonNull
    @Override
    public AdapterDzikir.DzikirHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_zikir_pagipetang, viewGroup, false);
        return new DzikirHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDzikir.DzikirHolder dzikirHolder, int i) {

        dzikirHolder.binView(listDzikir.get(i));
    }

    @Override
    public int getItemCount() {
        return listDzikir.size();
    }

    public class DzikirHolder extends RecyclerView.ViewHolder {
        private TextView tvNo, tvArab, tvArti;

        public DzikirHolder(@NonNull View itemView) {
            super(itemView);

            tvNo = itemView.findViewById(R.id.tvNo);
            tvArab = itemView.findViewById(R.id.tvArab);
            tvArti = itemView.findViewById(R.id.tvArti);

        }

        public void binView(ModelDzikir modelDzikir) {
            tvNo.setText(modelDzikir.getTvNo());
            tvArab.setText(modelDzikir.getTvArab());
            tvArti.setText(modelDzikir.getTvArti());

        }
    }
}
