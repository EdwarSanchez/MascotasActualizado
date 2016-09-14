package com.codedwar.edwar.mascotas.Adapter;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.codedwar.edwar.mascotas.POJO.Mascotas;
import com.codedwar.edwar.mascotas.R;

import java.util.ArrayList;

/**
 * Created by Edwar on 13/09/2016.
 */
public class PerfilAdapter extends RecyclerView.Adapter<PerfilAdapter.ViewPerfil> {
    ArrayList<Mascotas> mascotasLista;

    public PerfilAdapter(ArrayList<Mascotas> mascotasLista){
        this.mascotasLista = mascotasLista;
    }

    @Override
    public ViewPerfil onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil,parent,false);
        return new ViewPerfil(v);
    }

    @Override
    public void onBindViewHolder(final ViewPerfil holder, int position) {
        Mascotas mascotas = mascotasLista.get(position);
        holder.tvCantidadLikes.setText(""+mascotas.getCantidadLikes());
        holder.ivMascotaPerfil.setImageResource(mascotas.getFotoMascota());


    }

    @Override
    public int getItemCount() {
        return mascotasLista.size();
    }

    public static class ViewPerfil extends RecyclerView.ViewHolder{
        private ImageView ivMascotaPerfil;
        private ImageView ivHuesoLikes;
        private TextView tvCantidadLikes;


        public ViewPerfil(View itemView) {
            super(itemView);

            ivMascotaPerfil = (ImageView) itemView.findViewById(R.id.ivMascota);
            ivHuesoLikes = (ImageView) itemView.findViewById(R.id.ivHuesoCantidad);
            tvCantidadLikes = (TextView) itemView.findViewById(R.id.tvCantidadLikes);


        }



    }
}
