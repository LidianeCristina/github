package com.example.lidianecristina.brasil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sul);
    }

    public void curiosidadesSul(View view) {
        Intent curiosidades = new Intent(this, CuriosidadesSul.class);
        startActivity(curiosidades);
    }

    public void culturaSul(View view) {
        Intent cultura = new Intent(this, CulturaSul.class);
        startActivity(cultura);
    }

    public void estadosSul(View view) {
        Intent estados = new Intent(this, EstadosSul.class);
        startActivity(estados);
    }

    public void climaSul(View view) {
        Intent clima = new Intent(this, ClimaSul.class);
        startActivity(clima);
    }
}
