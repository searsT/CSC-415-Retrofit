package com.example.retrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class Retro
{
    public interface Api
    {
        @GET("/json_data.json")
        Call<Albums1> getAlbums();
    }
    private static final String Web_Json = "https://jsonplaceholder.typicode.com/albums";
    private static Retrofit goRetro()
    {
        return new Retrofit.Builder()
                .baseUrl(Web_Json)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}