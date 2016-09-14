package com.codedwar.edwar.mascotas.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.codedwar.edwar.mascotas.POJO.Comunicador;
import com.codedwar.edwar.mascotas.POJO.Mascotas;
import com.codedwar.edwar.mascotas.R;

import java.util.ArrayList;

/**
 * Created by Edwar on 12/09/2016.
 */
public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {
    ArrayList<Mascotas> mascotas;
    ArrayList<Mascotas> favoritas = new ArrayList<Mascotas>();
    Comunicador comunicador = new Comunicador();

    public MascotaAdapter(ArrayList<Mascotas> mascotas){
        this.mascotas = mascotas;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder holder, int position) {
        final Mascotas mascota = mascotas.get(position);
        holder.ivMascota.setImageResource(mascota.getFotoMascota());
        holder.tvNonmbre.setText(mascota.getNombre());
        holder.tvCantidadLikes.setText(""+mascota.getCantidadLikes());

        holder.ivbLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cantidad = mascota.getCantidadLikes();

                holder.tvCantidadLikes.setText(""+suma(cantidad,mascota));
                if(favoritas.size() >= 5){
                    favoritas.remove(0);
                    favoritas.add(new Mascotas(mascota.getFotoMascota(),mascota.getNombre(),mascota.getCantidadLikes()));
                }
                else favoritas.add(new Mascotas(mascota.getFotoMascota(),mascota.getNombre(),mascota.getCantidadLikes()));
                comunicador.setListaMascotas(favoritas);

            }
        });

    }



    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivMascota;
        private TextView tvNonmbre;
        private TextView tvCantidadLikes;
        private ImageButton ivbLike;
        public MascotaViewHolder(View itemView) {
            super(itemView);
            ivMascota       = (ImageView) itemView.findViewById(R.id.imvMascota);
            tvNonmbre       = (TextView) itemView.findViewById(R.id.tvNombre);
            tvCantidadLikes = (TextView) itemView.findViewById(R.id.tvCantidadLikes);
            ivbLike         = (ImageButton) itemView.findViewById(R.id.btnHuesoLike);

        }
    }

    public int suma(int cantidad, Mascotas mascota){
        cantidad += 1;
        mascota.setCantidadLikes(cantidad);
        return mascota.getCantidadLikes();
    }
}
