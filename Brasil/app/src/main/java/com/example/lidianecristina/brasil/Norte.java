package com.example.lidianecristina.brasil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Norte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_norte);
    }

    public void culturaNorte(View view){
        Intent cultura = new Intent(this, CulturaNorte.class);
        startActivity(cultura);
    }

    public void climaNorte(View view) {
        Intent clima = new Intent(this, ClimaNorte.class);
        startActivity(clima);
    }

    public void estadosNorte(View view) {
        Intent estado = new Intent(this, EstadosNorte.class);
        startActivity(estado);
    }

    public void curiosidadesNorte(View view) {
        Intent curiosidades = new Intent(this, CuriosidadesNorte.class);
        startActivity(curiosidades);
    }
}
