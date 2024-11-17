package com.example.pariwisata.model;

public class Place {
    private String nama;
    private String lokasi;
    private int imageResourceId;

    // Constructor
    public Place(String nama, String lokasi, int imageResourceId) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.imageResourceId = imageResourceId;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}



