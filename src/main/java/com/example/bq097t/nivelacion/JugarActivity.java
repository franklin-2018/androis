package com.example.bq097t.nivelacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class JugarActivity extends AppCompatActivity {
    Button btnPiedra, btnPapel, btnTijera;
    TextView txtGanados, txtPerdidos, txtEmpatados;
    int JugadorPuntaje=0;
    int CPUpuntaje=0;
    ImageView imgJugador, imgCPU;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);

        btnPiedra=(Button)findViewById(R.id.btnPiedra);
        btnPapel=(Button)findViewById(R.id.btnPapel);
        btnTijera=(Button)findViewById(R.id.btnTijera);

        txtGanados=(TextView)findViewById(R.id.txtGanados);
        txtEmpatados=(TextView)findViewById(R.id.txtEmpatados);
        txtPerdidos=(TextView)findViewById(R.id.txtPerdidos);

        imgJugador = (ImageView)findViewById(R.id.imgJugador);
        imgCPU = (ImageView)findViewById(R.id.imgCPU);

        btnPiedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgJugador.setImageResource(R.drawable.piedra);
                String mensaje = turno("PIEDRA");
                Toast.makeText(JugarActivity.this,mensaje,Toast.LENGTH_LONG).show();
                txtGanados.setText(" "+Integer.toString(JugadorPuntaje));
                txtPerdidos.setText(" "+Integer.toString(CPUpuntaje));

            }
        });

        btnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgJugador.setImageResource(R.drawable.papel);
                String mensaje = turno("PAPEL");
                Toast.makeText(JugarActivity.this,mensaje, Toast.LENGTH_LONG).show();
                txtGanados.setText(" "+Integer.toString(JugadorPuntaje));
                txtPerdidos.setText(" "+Integer.toString(CPUpuntaje));

            }
        });
        btnTijera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgJugador.setImageResource(R.drawable.tijeras);
                String mensaje = turno("PIEDRA");
                Toast.makeText(JugarActivity.this,mensaje,Toast.LENGTH_LONG).show();
                txtGanados.setText(" "+Integer.toString(JugadorPuntaje));
                txtPerdidos.setText(" "+Integer.toString(CPUpuntaje));

            }
        });

    }
    public String turno(String elegido) {

        String dispositivo_selecciono = " ";
        Random r = new Random();
        int dispos_selecciono_numero = r.nextInt(3) + 1;
        if (dispos_selecciono_numero == 1) {
            dispositivo_selecciono = "PIEDRA";
        } else if (dispos_selecciono_numero == 2) {
            dispositivo_selecciono = "PAPEL";
        } else if (dispos_selecciono_numero == 3) {
            dispositivo_selecciono = "TIJERA";
        }

        if (dispositivo_selecciono == "PIEDRA") {
            imgCPU.setImageResource(R.drawable.piedra);
        } else if (dispositivo_selecciono == "PAPEL") {
            imgCPU.setImageResource(R.drawable.papel);
        } else if (dispositivo_selecciono == "TIJERAS") {
            imgCPU.setImageResource(R.drawable.tijeras);

        }
        if (dispositivo_selecciono == elegido) {
            return "EMPATADOS";
        } else if (elegido == "PIEDRA" && dispositivo_selecciono == "TIJERAS") {
            JugadorPuntaje++;
            return "PIEDRA GANA A TIJERAS, FELICIDADES GANASTE...";
        } else if (elegido == "PIEDRA" && dispositivo_selecciono == "PAPEL") {
            CPUpuntaje++;
            return "PAPEL GANA A PIEDRA, PERDISTE...";
        } else if (elegido == "TIJERAS" && dispositivo_selecciono == "PIEDRA") {
            CPUpuntaje++;
            return "PIEDRA ROMPE A TIJERAS, PERDISTE...";
        } else if (elegido == "TIJERAS" && dispositivo_selecciono == "PAPEL") {
            JugadorPuntaje++;
            return "TIJERAS GANA A PAPEL, FELICIDADES GANASTE";
        } else if (elegido == "PAPEL" && dispositivo_selecciono == "PIEDRA") {
            JugadorPuntaje++;
            return "PAPEL GANA A PIEDRA, FELICIDADES GANASTE";
        } else if (elegido == "PAPEL" && dispositivo_selecciono == "TIJERAS") {
            CPUpuntaje++;
            return "TIJERAS GANA A PAPEL, PERDISTE";
        } else return "NO SEGURO";


    }
}
