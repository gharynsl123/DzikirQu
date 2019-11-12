package com.gharin.dzikirqu.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gharin.dzikirqu.Model.ModelDzikir;
import com.gharin.dzikirqu.Model.ModelSetelahShalat;
import com.gharin.dzikirqu.R;
import com.gharin.dzikirqu.Tasbih;

import java.util.ArrayList;

public class AdapterSetelahShalat extends RecyclerView.Adapter<AdapterSetelahShalat.SholatHolder> {


    ArrayList<ModelSetelahShalat> listSetelahShalat;

    public AdapterSetelahShalat(ArrayList<ModelSetelahShalat> listSetelahShalat) {
        this.listSetelahShalat = listSetelahShalat;
    }

    @NonNull
    @Override
    public SholatHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_setelah_sholat, viewGroup, false);
        return new AdapterSetelahShalat.SholatHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSetelahShalat.SholatHolder sholatHolder, int i) {
        sholatHolder.binView(listSetelahShalat.get(i));
    }


    @Override
    public int getItemCount() {

        return listSetelahShalat.size();

    }

    public class SholatHolder extends RecyclerView.ViewHolder {

        private TextView tvNo, tvArab, tvArti;

        public SholatHolder(@NonNull View itemView) {
            super(itemView);

            tvNo = itemView.findViewById(R.id.tvNo);
            tvArab = itemView.findViewById(R.id.tvArab);
            tvArti = itemView.findViewById(R.id.tvArti);
        }

        public void binView(ModelSetelahShalat modelSetelahShalat) {
            tvNo.setText(modelSetelahShalat.getTvNo());
            tvArab.setText(modelSetelahShalat.getTvArab());
            tvArti.setText(modelSetelahShalat.getTvArti());
            final String idDzikir = modelSetelahShalat.getId();

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Tasbih.class);
                    intent.putExtra(Tasbih.KEY_MOVIE, idDzikir);
                    if (idDzikir.equals("4")) {
                        itemView.getContext().startActivity(intent);
                        ((Activity)itemView.getContext()).finish();
                    }

                }

            });
        }
    }
}
