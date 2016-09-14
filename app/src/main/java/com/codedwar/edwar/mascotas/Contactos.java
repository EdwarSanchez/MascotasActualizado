package com.codedwar.edwar.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

public class Contactos extends AppCompatActivity {
    private EditText etNombre;
    private EditText etCorreo;
    private EditText etAsunto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        Toolbar miToolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(miToolbar);
        getSupportActionBar().setTitle("Contacto");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etNombre = (EditText)findViewById(R.id.etNombre);
        etCorreo = (EditText)findViewById(R.id.etCorreo);
        etAsunto = (EditText)findViewById(R.id.etAsunto);



    }
}
