package com.example.ourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ourapplication.Domain.BatikDomain;
import com.example.ourapplication.Domain.KategoriDomain;

public class DetailKategori extends AppCompatActivity {

    private TextView title,deskripsi;
    private ImageView kategoriGambar;
    private BatikDomain object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kategori);
        
        initView();
        getBundle();
    }

    private void getBundle() {
        object=(BatikDomain) getIntent().getSerializableExtra("object");

        int drawableResourceId= this.getResources().getIdentifier(object.getGambar(),"drawable", this.getPackageName());

        Glide.with(this)
                .load(drawableResourceId)
                .into(kategoriGambar);

        title.setText(object.getTitle());
        deskripsi.setText(object.getDeskripsi());


    }

    private void initView() {
        title= findViewById(R.id.kategorinama);
        deskripsi = findViewById(R.id.deskripsi);
        kategoriGambar = findViewById(R.id.kategorigambar);
    }
}