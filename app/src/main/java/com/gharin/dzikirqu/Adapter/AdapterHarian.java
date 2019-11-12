package com.gharin.dzikirqu.Adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gharin.dzikirqu.DetailHarian;
import com.gharin.dzikirqu.Model.ModelHarian;
import com.gharin.dzikirqu.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterHarian extends RecyclerView.Adapter<AdapterHarian.HarianHolder> {

    ArrayList<ModelHarian> listHarian;

    public AdapterHarian(ArrayList<ModelHarian> listHarian) {
        this.listHarian = listHarian;
    }

    @NonNull
    @Override
    public AdapterHarian.HarianHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_harian, viewGroup, false);
        return new AdapterHarian.HarianHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHarian.HarianHolder harianHolder, int i) {

        harianHolder.binView(listHarian.get(i));

    }

    @Override
    public int getItemCount() {
        return listHarian.size();
    }

    public class HarianHolder extends RecyclerView.ViewHolder {

        private TextView tvHarian;
        private ImageView ivHarian;

        public HarianHolder(@NonNull View itemView) {
            super(itemView);

            tvHarian = itemView.findViewById(R.id.tvListHarian);
            ivHarian = itemView.findViewById(R.id.ivLauncherHarian);

        }

        public void binView(ModelHarian modelHarian) {

            tvHarian.setText(modelHarian.getTvHarian());
            ivHarian.setImageResource(modelHarian.getIvHarian());
            final String idHarian = modelHarian.getIdHarian();

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailHarian.class)
                            .putExtra(DetailHarian.KEY_HARIAN, idHarian));
                }
            });

        }
    }
}
