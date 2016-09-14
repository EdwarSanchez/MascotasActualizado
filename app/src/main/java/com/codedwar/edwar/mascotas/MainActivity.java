package com.codedwar.edwar.mascotas;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.codedwar.edwar.mascotas.Adapter.PageAdapter;
import com.codedwar.edwar.mascotas.Fragments.DetalleFragment;
import com.codedwar.edwar.mascotas.Fragments.MascotasFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.appBar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        if(toolbar != null) {
            setSupportActionBar(toolbar);
        }

        setUpViewPager();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.mContacto:
                Intent intent = new Intent(this,Contactos.class);
                startActivity(intent);
                break;
            case R.id.mAcercaDe:
                Intent intent2 = new Intent(this,AcercaDe.class);
                startActivity(intent2);
                break;
            case R.id.avFavoritos:
                Intent intent3 = new Intent(this,MascotasFavoritas.class);
                startActivity(intent3);
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    public ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> lista = new ArrayList<>();
        lista.add(new MascotasFragment());
        lista.add(new DetalleFragment());
        return lista;
    }

    public void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_house);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_dog);
    }
}
