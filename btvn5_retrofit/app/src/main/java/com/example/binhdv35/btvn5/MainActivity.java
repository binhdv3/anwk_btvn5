package com.example.binhdv35.btvn5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.binhdv35.btvn5.API.APIservice;
import com.example.binhdv35.btvn5.Adrapter.AlbumAdrapter;
import com.example.binhdv35.btvn5.model.Album;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rccAlbum;
    private List<Album> albumList;
    private AlbumAdrapter adrapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rccAlbum = findViewById(R.id.rcc_album);
        showAlbum();
    }

    private void showAlbum() {

        albumList = new ArrayList<>();

        APIservice.apiservice.getListAlbum().enqueue(new Callback<List<Album>>() {
            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                albumList = response.body();
                adrapter = new AlbumAdrapter(albumList);
                rccAlbum.setAdapter(adrapter);
            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable t) {
                Log.e("mm", "" + t.getMessage());
            }
        });

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        rccAlbum.setLayoutManager(linearLayoutManager);
        adrapter = new AlbumAdrapter(albumList);
        rccAlbum.setAdapter(adrapter);
    }
}