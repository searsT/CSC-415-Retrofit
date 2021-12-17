package com.example.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Albums1
{
    public class Album
    {
        @SerializedName("userId")
        @Expose
        private String userId;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;

        public void setUserId(String userId)
        {
            this.userId = userId;
        }
        public void setId(String id)
        {
            this.id = id;
        }
        public void setTitle(String title)
        {
            this.title = title;
        }
        public String getUserId()
        {
            return userId;
        }
        public String getId()
        {
            return id;
        }
        public String getTitle()
        {
            return title;
        }
    }
    @SerializedName("userId")
    @Expose
    private ArrayList<Albums1> albums = null;
    public ArrayList<Albums1> getAlbums()
    {
        return albums;
    }
    public void enterAlbum(ArrayList<Albums1> a)
    {
        this.albums = a;
    }

    public class Albumdisplay extends RecyclerView.ViewHolder
    {
        public TextView userId;
        public TextView id;
        public TextView tite;
        public Albumdisplay(View a)
        {
            super(a);
            userId = (TextView) itemView.findViewById(R.id.userId);
            id = (TextView) itemView.findViewById(R.id.id);
            tite = (TextView) itemView.findViewById(R.id.title);
        }
    }
    /*public class AlbumConvert extends RecyclerView.Adapter<Albumdisplay>
    {
        List<Album> albums1List = Collections.emptyList();
        Context context;
        public AlbumConvert(List<Album> albums1List, Context context)
        {
            this.albums1List = albums1List;
            this.context = context;
        }
        @Override
        public Albumdisplay onCreateViewHolder(ViewGroup parent, int ViewType)
        {
            View a = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recyclerview, parent, false);
            return new Albumdisplay(a);
        }
        @Override
        public void onBindViewHolder(Albumdisplay a, int b)
        {
            a.userId.setText(albums1List.get(b).getUserId());
            a.id.setText(albums1List.get(b).getId());
            a.tite.setText(albums1List.get(b).getTitle());
        }
        /*@Override
        public int getItemCount()
        {
            return albums1List.size();
        }
        @Override
    }*/
}
