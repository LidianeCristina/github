package com.example.lidianecristina.brasil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirNorte(View view){
        Intent norte = new Intent(this, Norte.class);
        startActivity(norte);
    }


    public void abrirSul(View view){
        Intent sul = new Intent(this, Sul.class);
        startActivity(sul);
    }

    public void abrirCentroOeste(View view){
        Intent centroOeste = new Intent(this, CentroOeste.class);
        startActivity(centroOeste);
    }

    public void abrirNordeste(View view){
        Intent nordeste = new Intent(this, RegiaoNordeste.class);
        startActivity(nordeste);
    }

    public void abrirSuldeste(View view) {
        Intent sudeste = new Intent(this, Sudeste.class);
        startActivity(sudeste);
    }
}

