package com.example.pariwisata.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.pariwisata.R;
import com.example.pariwisata.detailactivity;
import com.example.pariwisata.model.Place;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;
import java.util.HashSet;
import android.util.Log;
import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> implements Filterable {

    private List<Place> placeList; // Daftar yang ditampilkan
    private List<Place> placeListFull; // Daftar penuh yang tidak terfilter

    // Constructor
    public PlaceAdapter(List<Place> placeList) {
        this.placeList = new ArrayList<>(new HashSet<>(placeList)); // Menghapus duplikat di daftar asli
        this.placeListFull = new ArrayList<>(this.placeList); // Salin daftar yang telah dihapus duplikatnya

        // Debugging log
        for (Place place : this.placeList) {
            Log.d("PlaceAdapter", "Place name: " + place.getNama());
        }
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout for each item
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_wisata, parent, false);
        return new PlaceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        // Bind data to the views
        Place currentPlace = placeList.get(position);
        holder.nameTextView.setText(currentPlace.getNama());
        holder.locationTextView.setText(currentPlace.getLokasi());
        holder.imageView.setImageResource(currentPlace.getImageResourceId());

        // Tambahkan onClickListener untuk item
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(holder.itemView.getContext(), detailactivity.class);
            intent.putExtra("placeName", currentPlace.getNama());
            intent.putExtra("placeLocation", currentPlace.getLokasi());
            intent.putExtra("placeImage", currentPlace.getImageResourceId());
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }

    // Implementasi untuk melakukan filter pencarian
    @Override
    public Filter getFilter() {
        return placeFilter;
    }

    // Filter untuk menyaring data
    private Filter placeFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Place> filteredList = new ArrayList<>();
            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(placeListFull); // Tampilkan seluruh data jika tidak ada query pencarian
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for (Place place : placeListFull) {
                    // Filter berdasarkan nama atau lokasi
                    if (place.getNama().toLowerCase().contains(filterPattern) || place.getLokasi().toLowerCase().contains(filterPattern)) {
                        filteredList.add(place);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            placeList.clear();
            if (results.values != null) {
                placeList.addAll((List) results.values);
            }
            notifyDataSetChanged(); // Memperbarui tampilan adapter

            // Debugging log untuk memastikan tidak ada duplikat setelah filtering
            Log.d("PlaceAdapter", "Filtered placeList size: " + placeList.size());
            for (Place place : placeList) {
                Log.d("PlaceAdapter", "Filtered Place name: " + place.getNama());
            }
        }
    };

    // ViewHolder class to hold references to the views
    public static class PlaceViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView locationTextView;
        ImageView imageView;

        public PlaceViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.textViewName);
            locationTextView = itemView.findViewById(R.id.textViewLocation);
            imageView = itemView.findViewById(R.id.imageViewThumbnail);
        }
    }
}
