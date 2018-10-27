package com.example.bq097t.nivelacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NuevoJugadorActivity extends AppCompatActivity {
  public Button btnAdd;
  public EditText edtnombrejugador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_jugador);
        btnAdd = findViewById(R.id.btnguardar);
        edtnombrejugador = findViewById(R.id.etxnombrejugador);
    }
    public  void Even(View view){
        switch (view.getId()){
            case R.id.btnguardar:

                String nombre = edtnombrejugador.getText().toString();
                edtnombrejugador.setText(nombre);
                Intent Add = new Intent(NuevoJugadorActivity.this,ListaActivity.class);

                  Bundle miBundle = new Bundle();
                  miBundle.putString("nombre",edtnombrejugador.getText().toString());
                  Add.putExtras(miBundle);

                Toast.makeText(this,"Jugador Ingresado",Toast.LENGTH_SHORT).show();


                startActivity(Add);
                finish();


                break;
        }
    }

}
