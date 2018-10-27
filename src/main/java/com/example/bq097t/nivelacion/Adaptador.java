package com.example.bq097t.nivelacion;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;

import java.util.List;

public class Adaptador extends BaseAdapter {
   Context context;
   List<jugador>ListaObjeto;
    private Layout plantilla;

    public Adaptador(Context context, List<jugador> listaObjeto ,Layout plantilla) {
        this.context = context;
        ListaObjeto = listaObjeto;
        this.plantilla=plantilla;
    }

    @Override
    public int getCount() {
        return ListaObjeto.size();
    }

    @Override
    public Object getItem(int position) {
        return ListaObjeto.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            //adquirir el layout plantilla
            LayoutInflater adminLayout =(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         convertView = adminLayout.inflate((XmlPullParser) this.plantilla,null);

            jugador jugadoractual = this.ListaObjeto.get(position);
            TextView lblnombre = convertView.findViewById(R.id.txtNombre);

            lblnombre.setText(jugadoractual.getNombre());
        }
        return convertView;
    }
}
