package com.example.ourapplication.Domain;

import java.io.Serializable;

public class BatikDomain implements Serializable {
    private String title;
    private String gambar;
    private String deskripsi;
    private int harga;

    public BatikDomain(String title, String gambar, String deskripsi) {
        this.title = title;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }

    public BatikDomain(String title, String gambar, String deskripsi, int price) {
        this.title = title;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
