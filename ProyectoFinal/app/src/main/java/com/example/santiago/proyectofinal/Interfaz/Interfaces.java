package com.example.santiago.proyectofinal.Interfaz;
import com.example.santiago.proyectofinal.Modelos.PuntosWifi;
import com.example.santiago.proyectofinal.Modelos.ViveDigital;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interfaces {

    @GET("itnf-295z.json")
    Call<ArrayList<PuntosWifi>> obtenerListaPuntosWIfi();

    @GET("eu8q-tixz.json")
    Call<ArrayList<ViveDigital>> obtenerListaViveDigital();
}
