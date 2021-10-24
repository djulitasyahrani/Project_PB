package com.example.ourapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ourapplication.Domain.KategoriDomain;
import com.example.ourapplication.R;

import java.util.ArrayList;

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.Viewholder> {
    ArrayList<KategoriDomain> kategoriDomains;

    public KategoriAdapter(ArrayList<KategoriDomain> kategoriDomains) {
        this.kategoriDomains = kategoriDomains;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_kat,parent, false);
        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.kategoriNama.setText(kategoriDomains.get(position).getTitle());
        String picURL="";
        switch (position){
            case 0:{
                picURL="batik_1";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.kategori_background1));
                break;
            }
            case 1:{
                picURL="batik_2";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.kategori_background2));
                break;
            }
            case 2:{
                picURL="batik_3";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.kategori_background3));
                break;
            }
            case 3:{
                picURL="batik_4";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.kategori_background4));
                break;
            }
            case 4:{
                picURL="batik_5";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.kategori_background5));
                break;
            }
            case 5:{
                picURL="batik_6";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.kategori_background5));
                break;
            }

        }
        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(picURL,
                "drawable", holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.kategoriGambar);
    }

    @Override
    public int getItemCount() {
        return kategoriDomains.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView kategoriNama;
        ImageView kategoriGambar;
        ConstraintLayout mainLayout;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            kategoriNama=itemView.findViewById(R.id.popularNama);
            kategoriGambar=itemView.findViewById(R.id.popularGambar);
            mainLayout=itemView.findViewById(R.id.mainLayout);
        }
    }
}
