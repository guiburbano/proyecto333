package com.example.santiago.proyectofinal.Fragmentos;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.santiago.proyectofinal.Adaptadores.AdaptadorPuntosWIfi;
import com.example.santiago.proyectofinal.Interfaz.Interfaces;
import com.example.santiago.proyectofinal.Modelos.PuntosWifi;
import com.example.santiago.proyectofinal.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FragmentPuntosWifi extends Fragment
{
    private Retrofit retrofit;
    private static final String TAG = "DATO";
    private RecyclerView recyclerView;
    private FragmentActivity myContext;
    private AdaptadorPuntosWIfi puntosWifi;


    @Override
    public void onAttach(Activity activity)
    {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    public FragmentPuntosWifi()
    {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        final View view =  inflater.inflate(R.layout.fragment_puntos_wifi, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        puntosWifi = new AdaptadorPuntosWIfi(getContext());
        recyclerView.setAdapter(puntosWifi);
        recyclerView.setHasFixedSize(true);
        final GridLayoutManager layoutManager = new GridLayoutManager(getContext(),1);
        recyclerView.setLayoutManager(layoutManager);

        retrofit=new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        procesarDatos();
        return view;
    }

    private void procesarDatos()
    {
        Interfaces service = retrofit.create(Interfaces.class);
        Call<ArrayList<PuntosWifi>> datosPuntosWifi = service.obtenerListaPuntosWIfi();

        datosPuntosWifi.enqueue(new Callback<ArrayList<PuntosWifi>>() {
            @Override
            public void onResponse(Call<ArrayList<PuntosWifi>> call, Response<ArrayList<PuntosWifi>> response) {
                if (response.isSuccessful())
                {
                    ArrayList<PuntosWifi> datos = response.body();
                    puntosWifi.adicionarLista(datos);
                }
                else {
                    Log.e(TAG, "onResponse: "+response.errorBody());
                }

            }
            @Override
            public void onFailure(Call<ArrayList<PuntosWifi>> call, Throwable t) {
                Log.e(TAG, " onFailure: "+t.getMessage());
            }


        });

    }

}
