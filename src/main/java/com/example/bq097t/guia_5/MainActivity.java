package com.example.bq097t.guia_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button btnEjercicio;
   private Button btnEjemplo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEjemplo = findViewById(R.id.btnEjemplos);
        btnEjercicio = findViewById(R.id.btnEjercicios);
        btnEjemplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ejemplo = new Intent(MainActivity.this,EjemploActivity.class);
                startActivity(Ejemplo);
            }
        });

        btnEjercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ejercicio = new Intent(MainActivity.this,EjercicioActivity.class);
                startActivity(Ejercicio);
            }
        });
    }
}
