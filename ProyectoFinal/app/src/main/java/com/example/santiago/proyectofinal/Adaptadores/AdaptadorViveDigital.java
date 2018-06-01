package com.example.santiago.proyectofinal.Adaptadores;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.santiago.proyectofinal.Modelos.ViveDigital;
import com.example.santiago.proyectofinal.R;

import java.util.ArrayList;

public class AdaptadorViveDigital extends RecyclerView.Adapter<AdaptadorViveDigital.ViewHolder> {


    private ArrayList<ViveDigital> datos;
    private Context context;

    public AdaptadorViveDigital(Context context) {
        this.context = context;
        datos = new ArrayList<>();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_vive_digital, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ViveDigital p = datos.get(position);
        holder.TV1.setText(p.getIdBeneficiario());
        holder.TV2.setText(p.getFechaDeConvenio());
        holder.TV3.setText(p.getTipoDeBeneficiario());
        holder.TV4.setText(p.getElPuntoYaFueDonadoSiNo());

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }


    public void adicionarLista(ArrayList<ViveDigital> listaSIS) {
        datos.addAll(listaSIS);
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView TV1, TV2, TV3, TV4;


        public ViewHolder(View itemView) {
            super(itemView);

            TV1 = (TextView) itemView.findViewById(R.id.TV1);
            TV2 = (TextView) itemView.findViewById(R.id.TV2);
            TV3 = (TextView) itemView.findViewById(R.id.TV3);
            TV4 = (TextView) itemView.findViewById(R.id.TV4);
        }
    }
}
