package com.example.bq097t.nivelacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

   public TextView un ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        un = findViewById(R.id.txtNOmbreCaptura);


        Bundle miBundle = this.getIntent().getExtras();
        if (miBundle!=null){
         String nombre  = miBundle.getString("nombre");

                un.setText(nombre);
                    finish();
        }
    }
}
