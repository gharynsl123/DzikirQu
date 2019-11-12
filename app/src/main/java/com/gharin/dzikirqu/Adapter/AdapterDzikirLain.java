package com.gharin.dzikirqu.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gharin.dzikirqu.Model.ModelDzikir;
import com.gharin.dzikirqu.Model.ModelDzikirLain;
import com.gharin.dzikirqu.R;

import java.util.ArrayList;

public class AdapterDzikirLain extends RecyclerView.Adapter<AdapterDzikirLain.LainHolder> {
    ArrayList<ModelDzikirLain> listLain;

    public AdapterDzikirLain(ArrayList<ModelDzikirLain> listLain) {
        this.listLain = listLain;
    }

    @NonNull
    @Override
    public AdapterDzikirLain.LainHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_dzikir_lain, viewGroup, false);
        return new AdapterDzikirLain.LainHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDzikirLain.LainHolder lainHolder, int i) {

        lainHolder.binView(listLain.get(i));

    }

    @Override
    public int getItemCount() {
        return listLain.size();
    }

    public class LainHolder extends RecyclerView.ViewHolder {
        private TextView tvList;
        private ImageView ivLauncher;

        public LainHolder(@NonNull View itemView) {
            super(itemView);

            tvList = itemView.findViewById(R.id.tvlist);
            ivLauncher = itemView.findViewById(R.id.ivlauncher);

        }

        public void binView(ModelDzikirLain modelDzikirLain) {

            tvList.setText(modelDzikirLain.getTvlist());
            ivLauncher.setImageResource(modelDzikirLain.getIvLauncher());
            final String idDzikirLain = modelDzikirLain.getIdlist();



        }
    }
}
