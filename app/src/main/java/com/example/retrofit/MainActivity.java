package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.net.NetworkInterface;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!internetConnect())
        {
            findViewById(R.id.netStatus).setVisibility(View.VISIBLE);
        }
        else
        {
            //albumsjson();
        }
    }
    private boolean internetConnect(){

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        boolean yaGotNet = activeNetwork != null && activeNetwork.isConnectedOrConnecting();
        return yaGotNet;
    }
}