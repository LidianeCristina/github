package com.example.lidianecristina.brasil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegiaoNordeste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nordeste);
    }

    public void culturaNordeste(View view) {
        Intent cultura = new Intent(this, CulturaNordeste.class);
        startActivity(cultura);
    }

    public void climaNordeste(View view) {
        Intent clima = new Intent(this, ClimaNordeste.class);
        startActivity(clima);
    }

    public void estadosNordeste(View view) {
        Intent estado = new Intent(this, EstadosNordeste.class);
        startActivity(estado);
    }

    public void curiosidadesNordeste(View view) {
        Intent curiosidade = new Intent(this, CuriosidadesNordeste.class);
        startActivity(curiosidade);
    }
}
