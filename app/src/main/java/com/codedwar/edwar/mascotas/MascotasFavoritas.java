package com.codedwar.edwar.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.codedwar.edwar.mascotas.Adapter.FavoritosAdapter;
import com.codedwar.edwar.mascotas.POJO.Comunicador;
import com.codedwar.edwar.mascotas.POJO.Mascotas;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascotas> mascota;
    ArrayList<Mascotas> favoritas;
    private RecyclerView rvListaMascostas;
    Comunicador comunicador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);
        Toolbar miToolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(miToolbar);
        getSupportActionBar().setTitle("Mascotas Favoritas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        comunicador = new Comunicador();
        rvListaMascostas = (RecyclerView)findViewById(R.id.rvListaMascota);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvListaMascostas.setLayoutManager(llm);
        favoritas = comunicador.getListaMascotas();
        inicializarAdapter();
    }

    public void inicializarAdapter(){
        FavoritosAdapter mascotaAdapter = new FavoritosAdapter(favoritas);
        rvListaMascostas.setAdapter(mascotaAdapter);

    }
}
