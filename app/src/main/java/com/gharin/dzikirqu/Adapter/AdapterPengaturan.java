package com.gharin.dzikirqu.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gharin.dzikirqu.Model.ModelDzikir;
import com.gharin.dzikirqu.Model.ModelPengaturan;
import com.gharin.dzikirqu.R;

import java.util.ArrayList;

public class AdapterPengaturan extends RecyclerView.Adapter<AdapterPengaturan.PengaturanHolder> {

    ArrayList<ModelPengaturan> listPengaturan;

    public AdapterPengaturan(ArrayList<ModelPengaturan> listPengaturan) {
        this.listPengaturan = listPengaturan;
    }

    @NonNull
    @Override
    public AdapterPengaturan.PengaturanHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_pengaturan, viewGroup, false);
        return new AdapterPengaturan.PengaturanHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPengaturan.PengaturanHolder pengaturanHolder, int i) {

        pengaturanHolder.binView(listPengaturan.get(i));
    }

    @Override
    public int getItemCount() {
        return listPengaturan.size();
    }

    public class PengaturanHolder extends RecyclerView.ViewHolder {
        private TextView  tvJudul, tvKeterangan;
        private ImageView ivPengaturan;

        public PengaturanHolder(@NonNull View itemView) {
            super(itemView);

            tvJudul = itemView.findViewById(R.id.tvJudulPenga);
            tvKeterangan = itemView.findViewById(R.id.tvKeteranganPenga);

            ivPengaturan = itemView.findViewById(R.id.ivPengaturan);

        }

        public void binView(ModelPengaturan modelPengaturan) {

            tvJudul.setText(modelPengaturan.getTvJudul());
            tvKeterangan.setText(modelPengaturan.getTvKeterangan());
            ivPengaturan.setImageResource(modelPengaturan.getIvPengaturan());
            final String idpengaturan = modelPengaturan.getTvPengaturanid();
        }
    }
}
