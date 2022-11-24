package com.ahmfarisi.pahlawanku;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterGrid extends RecyclerView.Adapter<AdapterGrid.VHPahlawan>{
    private ArrayList<ModelPahlawan> dataPahlawan;
    private Context ctx;

    public AdapterGrid(ArrayList<ModelPahlawan> dataPahlawan, Context ctx) {
        this.dataPahlawan = dataPahlawan;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public VHPahlawan onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View VW = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new VHPahlawan(VW);
    }

    @Override
    public void onBindViewHolder(@NonNull VHPahlawan holder, int position) {
        ModelPahlawan pahlawan = dataPahlawan.get(position);

        Glide
                .with(ctx)
                .load(pahlawan.getFoto())
                .centerCrop()
                .into(holder.ivGrid);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xNama, xTentang, xFoto;

                xNama = pahlawan.getNama();
                xTentang = pahlawan.getTentang();
                xFoto = pahlawan.getFoto();

                Intent kirim = new Intent(ctx, DetailActivity.class);
                kirim.putExtra("xNama", xNama);
                kirim.putExtra("xTentang", xTentang);
                kirim.putExtra("xFoto", xFoto);
                ctx.startActivity(kirim);

            }
        });

    }

    @Override
    public int getItemCount() {
        return dataPahlawan.size();
    }

    public class VHPahlawan extends RecyclerView.ViewHolder {
        ImageView ivGrid;

        public VHPahlawan(@NonNull View itemView) {
            super(itemView);
            ivGrid = itemView.findViewById(R.id.iv_grid);
        }
    }
}
