package com.example.lidianecristina.brasil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CentroOeste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro_oeste);
    }

    public void culturaCO(View view) {
        Intent cultura = new Intent(this, CulturaCO.class);
        startActivity(cultura);
    }

    public void climaCO(View view) {
        Intent clima = new Intent(this, ClimaCO.class);
        startActivity(clima);
    }

    public void curiosidadesCO(View view) {
        Intent curiosidades = new Intent(this, CuriosidadesCO.class);
        startActivity(curiosidades);
    }

    public void estadosCO(View view) {
        Intent estados = new Intent(this, EstadosCO.class);
        startActivity(estados);
    }
}
