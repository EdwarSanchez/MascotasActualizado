package com.codedwar.edwar.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
        Toolbar miToolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(miToolbar);
        getSupportActionBar().setTitle("Acerca De");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView tvTitulo = (TextView)findViewById(R.id.tvCreado);
        TextView tvNombre = (TextView)findViewById(R.id.tvNombre);
    }
}
