package com.example.ourapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ourapplication.Adapter.KategoriAdapter;
import com.example.ourapplication.Domain.KategoriDomain;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewKategoriList;
    private RecyclerView recyclerViewPopulerList;

    ViewFlipper v_flipper;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[]={R.drawable.slide_1, R.drawable.slide_2, R.drawable.slide_3};
        v_flipper = findViewById(R.id.v_flipper);

        for(int image : images){
            flipperImages(image);
        }

    recyclerViewKategori();
}

    private void recyclerViewKategori(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager
                (this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewKategoriList = findViewById(R.id.recyclerView);
        recyclerViewKategoriList.setLayoutManager(linearLayoutManager);

        ArrayList<KategoriDomain> kategoriList=new ArrayList<>();
        kategoriList.add(new KategoriDomain("Banten", "batik_1"));
        kategoriList.add(new KategoriDomain("Cirebon", "batik_2"));
        kategoriList.add(new KategoriDomain("Pekalongan", "batik_3"));
        kategoriList.add(new KategoriDomain("Solo", "batik_4"));
        kategoriList.add(new KategoriDomain("Surakarta", "batik_5"));
        kategoriList.add(new KategoriDomain("Yogyakarta", "batik_6"));

        adapter = new KategoriAdapter(kategoriList);
        recyclerViewKategoriList.setAdapter(adapter);
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

}