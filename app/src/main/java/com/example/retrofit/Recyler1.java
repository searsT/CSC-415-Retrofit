package com.example.retrofit;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.example.retrofit.Albums1;

public class Recyler1 extends AppCompatActivity {
    private ArrayList<Albums1.Album> albums;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler2);
        load();
    }

    private void load(){
        Retro.Api  a = Retro.getApi();
        Call<Albums1.Album> albums1Call = a.getAlbums();
        albums1Call.enqueue(new Callback<Albums1.Album>() {
            @Override
            public void onResponse(Call<Albums1.Album> call, Response<Albums1.Album> response) {
                RecyclerView recyAlb = (RecyclerView) findViewById(R.id.mrRecycler);
                albums = response.body().getAlbums();
                AlbumConvert albumConvert = new AlbumConvert(albums, Recyler1.this);
                recyAlb.setAdapter(albumConvert);
                recyAlb.setLayoutManager(new LinearLayoutManager(Recyler1.this));
                //Albums1.Album a1 = new Albums1.Album();
                //userID.setText();
            }

            @Override
            public void onFailure(Call<Albums1.Album> call, Throwable t) {
                System.exit(-1);
            }
        });
    }

}
