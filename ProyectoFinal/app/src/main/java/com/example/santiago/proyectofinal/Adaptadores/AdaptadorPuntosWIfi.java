package com.example.santiago.proyectofinal.Adaptadores;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.santiago.proyectofinal.Modelos.PuntosWifi;
import com.example.santiago.proyectofinal.R;

import java.util.ArrayList;


public class AdaptadorPuntosWIfi extends RecyclerView.Adapter<AdaptadorPuntosWIfi.ViewHolder> {


    private ArrayList<PuntosWifi> datos;
    private Context context;


    public AdaptadorPuntosWIfi(Context context) {
        this.context = context;
        datos = new ArrayList<>();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_puntos_wifi, parent, false );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        PuntosWifi p = datos.get(position);
        holder.TV1.setText(p.getPuntoWifi());
        holder.TV2.setText(p.getDireccion());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }




    public void adicionarLista(ArrayList<PuntosWifi> listaGPS) {
        datos.addAll(listaGPS);
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView TV1, TV2, TV3;


        public ViewHolder(View itemView) {
            super(itemView);

            TV1 = (TextView) itemView.findViewById(R.id.TV1);
            TV2 = (TextView) itemView.findViewById(R.id.TV2);
            TV3 = (TextView) itemView.findViewById(R.id.TV3);
        }
    }
}
