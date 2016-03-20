package com.example.lidianecristina.brasil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sudeste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudeste);
    }

    public void culturaSudeste(View view) {
        Intent cultura = new Intent(this, CulturaSudeste.class);
        startActivity(cultura);
    }

    public void climaSudeste(View view) {
        Intent clima = new Intent(this, ClimaSudeste.class);
        startActivity(clima);
    }

    public void estadosSudeste(View view) {
        Intent estados = new Intent(this, EstadosSudeste.class);
        startActivity(estados);
    }

    public void curiosidadesSudeste(View view) {
        Intent curiosidades = new Intent(this, CuriosidadesSudeste.class);
        startActivity(curiosidades);
    }
}
