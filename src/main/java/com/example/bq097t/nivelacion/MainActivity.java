package com.example.bq097t.nivelacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public  Button btnnuevo,btnjugar,btnpuntaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnuevo = findViewById(R.id.btnjugador);
        btnjugar = findViewById(R.id.btnjugar);
        btnpuntaje= findViewById(R.id.btnpuntaje);
    }

    public  void evento(View view){
        switch (view.getId()){
            case R.id.btnjugador:
                Intent nuevoJugador = new Intent(MainActivity.this,NuevoJugadorActivity.class);
                startActivity(nuevoJugador);
                break;
            case R.id.btnjugar:
                Intent jugar = new Intent(MainActivity.this,JugarActivity.class);
                startActivity(jugar);
                break;
        }

    }
}
