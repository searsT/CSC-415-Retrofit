package com.example.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import com.google.gson.annotations.Exposed;
//import com.google.gson.annotations.SerializedName;
public class Albums1
{
    public class Album {
        private String userId;

        private String id;

        private String title;

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUserId() {
            return userId;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }
        public ArrayList<Albums1.Album> albums = null;
        public ArrayList<Albums1.Album> getAlbums()
        {
            return albums;
        }
        public void enterAlbum(ArrayList<Albums1.Album> a)
        {
            this.albums = a;
        }
    }

    public static class Albumdisplay extends RecyclerView.ViewHolder
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

}