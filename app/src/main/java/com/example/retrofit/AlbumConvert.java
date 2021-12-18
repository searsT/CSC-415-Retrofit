package com.example.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;
import com.example.retrofit.Albums1.Albumdisplay;
import java.util.Collections;
import java.util.List;

public class AlbumConvert extends RecyclerView.Adapter<Albumdisplay>
{
    List<Albums1.Album> albums1List = Collections.emptyList();
    Context a;
    public AlbumConvert(List<Albums1.Album> albums1List, Context a)
    {
        this.albums1List = albums1List;
        this.a = a;
    }
    @Override
    public Albumdisplay onCreateViewHolder(ViewGroup parent, int ViewType)
    {
        View a = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler2, parent, false);
        return new Albumdisplay(a);
    }
    @Override
    public void onBindViewHolder(Albumdisplay a, int b)
    {
        a.userId.setText(albums1List.get(b).getUserId());
        a.id.setText(albums1List.get(b).getId());
        a.tite.setText(albums1List.get(b).getTitle());
    }
    @Override
    public int getItemCount()
    {
        return albums1List.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView a)
    {
        super.onAttachedToRecyclerView(a);
    }
}