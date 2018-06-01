package com.example.santiago.proyectofinal.Modelos;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PuntosWifi {

        @SerializedName("coordenadas_puntos_wifi")
        @Expose
        private PuntosWifi coordenadasPuntosWifi;
        @SerializedName("direccion")
        @Expose
        private String direccion;
        @SerializedName("punto_wifi")
        @Expose
        private String puntoWifi;
        @SerializedName("ubicaci_n_en_dos_columnas")

        public PuntosWifi getCoordenadasPuntosWifi() {
            return coordenadasPuntosWifi;
        }

        public void setCoordenadasPuntosWifi(PuntosWifi coordenadasPuntosWifi) {
            this.coordenadasPuntosWifi = coordenadasPuntosWifi;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getPuntoWifi() {
            return puntoWifi;
        }

        public void setPuntoWifi(String puntoWifi) {
            this.puntoWifi = puntoWifi;
        }

    }