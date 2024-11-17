package com.example.pariwisata;

import android.os.Bundle;
import android.util.Log;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.pariwisata.adapter.PlaceAdapter;
import com.example.pariwisata.model.Place;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlaceAdapter placeAdapter;
    private List<Place> placeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menginisialisasi RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Mengecek apakah placeList sudah diinisialisasi
        if (placeList == null) {
            // Menyiapkan data tempat wisata
            placeList = new ArrayList<>();
            placeList.add(new Place("Bromo", "Cemoro Lawang, Desa Ngadisari, Kecamatan Sukapura, Kabupaten Probolinggo, Jawa Timur", R.drawable.bromo));
            placeList.add(new Place("Taman Nasional Baluran", "Jalan Banyuwangi – Situbondo km 35, Desa Wonorejo, Kecamatan Banyuputih, Kabupaten Situbondo, Jawa Timur", R.drawable.baluran));
            placeList.add(new Place("Banda Neira", "Desa Banda, Kecamatan Banda, Kabupaten Maluku Tengah, Provinsi Maluku, Indonesia.", R.drawable.bandaneira));
            placeList.add(new Place("Bedugul", "Jl. Bedugul - Singaraja, Candikuning, Baturiti, Kabupaten Tabanan", R.drawable.bedugul));
            placeList.add(new Place("Candi Borobudur", "Jalan Badrawati, KW. Candi Borobudur, Borobudur, Kecamatan Borobudur, Kabupaten Magelang, Jawa Tengah", R.drawable.borobudur));
            placeList.add(new Place("Kawah Ijen", "Kabupaten Banyuwangi/ Kabupaten Bondowoso, Jawa Timur", R.drawable.ijen));
            placeList.add(new Place("Kelingking Beach", "Desa Bunga Mekar, pantai barat daya Pulau Nusa Penida, Kabupaten Klungkung, Bali, Indonesia", R.drawable.kelingking));
            placeList.add(new Place("Pulau Padar", "Kecamatan Komodo, Kabupaten Manggarai Barat, Provinsi Nusa Tenggara Timur (NTT)", R.drawable.padar));
            placeList.add(new Place("Pink Beach", "Kecamatan Komodo, Kabupaten Manggarai Barat, Nusa Tenggara Timur. Pantai ini merupakan bagian dari Taman Nasional Komodo", R.drawable.pinkbeach));
            placeList.add(new Place("Waerebo Village", "Kabupaten Manggarai Barat, Flores, Nusa Tenggara Timur", R.drawable.waerebo));

            // Menghapus duplikat
            placeList = new ArrayList<>(new HashSet<>(placeList));

            // Debugging log untuk memverifikasi data unik
            for (Place place : placeList) {
                Log.d("MainActivity", "Place name: " + place.getNama());
            }
        }

        // Inisialisasi adapter dan set ke RecyclerView
        placeAdapter = new PlaceAdapter(placeList);
        recyclerView.setAdapter(placeAdapter);



        // Menambahkan fitur pencarian
        SearchView searchView = findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false; // Tidak melakukan pencarian saat tombol submit ditekan
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Memanggil filter dari adapter dan mengirimkan query pencarian
                placeAdapter.getFilter().filter(newText);
                return true;
            }
        });
    }
}
