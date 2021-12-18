package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.example.retrofit.Albums1;
import com.example.retrofit.Retro;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!internetConnect())
        {
            findViewById(R.id.netStatus).setVisibility(View.VISIBLE);
        }

    }
    private boolean internetConnect(){

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        boolean yaGotNet = activeNetwork != null && activeNetwork.isConnectedOrConnecting();
        return yaGotNet;
    }

}