package com.example.binhdv35.btvn5.API;

import com.example.binhdv35.btvn5.model.Album;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface APIservice {

    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    //https://jsonplaceholder.typicode.com/photos

    APIservice apiservice = new Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")//uri
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build().create(APIservice.class);

    @GET("photos")
    Call<List<Album>> getListAlbum();

}
