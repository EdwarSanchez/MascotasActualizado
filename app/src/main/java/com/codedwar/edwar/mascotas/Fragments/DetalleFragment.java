package com.codedwar.edwar.mascotas.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codedwar.edwar.mascotas.Adapter.MascotaAdapter;
import com.codedwar.edwar.mascotas.Adapter.PerfilAdapter;
import com.codedwar.edwar.mascotas.POJO.Mascotas;
import com.codedwar.edwar.mascotas.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleFragment extends Fragment {
    private ArrayList<Mascotas> mascota;
    private RecyclerView rvListaMascostas;

    public DetalleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_detalle, container, false);
        rvListaMascostas = (RecyclerView) v.findViewById(R.id.rvDetalleMascota);
        GridLayoutManager glm = new GridLayoutManager(getContext(),3);
        rvListaMascostas.setLayoutManager(glm);
        inicializarDatos();
        inicializarAdapter();


        return v;
    }

    public void inicializarDatos(){
        mascota = new ArrayList<Mascotas>();

        mascota.add(new Mascotas(R.drawable.mascota1,"blaze",0));
        mascota.add(new Mascotas(R.drawable.mascota2,"payasa",0));
        mascota.add(new Mascotas(R.drawable.mascota3,"chester",0));
        mascota.add(new Mascotas(R.drawable.mascota4,"fifi",0));
        mascota.add(new Mascotas(R.drawable.mascota5,"coqueta",0));
        mascota.add(new Mascotas(R.drawable.mascota6,"rudo",0));
    }

    public void inicializarAdapter(){
        PerfilAdapter perfilAdapter = new PerfilAdapter(mascota);
        rvListaMascostas.setAdapter(perfilAdapter);
    }

}
