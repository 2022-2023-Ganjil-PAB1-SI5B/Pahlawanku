package com.ahmfarisi.pahlawanku;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPahlawan extends RecyclerView.Adapter<AdapterPahlawan.VHPahlawan>{
    private ArrayList<ModelPahlawan> dataPahlawan;
    private Context ctx;

    public AdapterPahlawan(ArrayList<ModelPahlawan> dataPahlawan, Context ctx) {
        this.dataPahlawan = dataPahlawan;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public VHPahlawan onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VHPahlawan holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VHPahlawan extends RecyclerView.ViewHolder {
        TextView tvNama, tvTentang;
        ImageView ivFoto;

        public VHPahlawan(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvTentang = itemView.findViewById(R.id.tv_tentang);
            ivFoto = itemView.findViewById(R.id.iv_foto);
        }
    }
}
