package com.example.listasimple;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
//import com.example.listasimple.R;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<String> elementos;
    private String valorPorDefault;
    private static final String TAG = Adaptador.class.getSimpleName();

    public Adaptador(String d, ArrayList<String> l){
        valorPorDefault = d;
        elementos = l;
        Log.d(TAG, "Elemento 0 en constructor de com.example.listasimple.Adaptador " + elementos.get(0));

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Encargado de crear los nuevos objetos ViewHolder necesarios
        //para los elementos de la coleccion

        RecyclerView.ViewHolder viewHolder = new SimpleViewHolder(
                LayoutInflater.from(parent.getContext()).inflate
                        (R.layout.row_item_layout, parent, false), elementos);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        //Encargado de actualizar los datos de un ViewHolder ya existente

        String elemento = elementos.get(position);
        Log.d(TAG, "Elemento en onBindViewHolder: " + elemento);
        SimpleViewHolder elementoViewHolder = (SimpleViewHolder) viewHolder;
        elementoViewHolder.setDato(elemento);
    }

    @Override
    public int getItemCount() {
        //indica el numero de elementos de la coleccion DATOS
        return elementos.size();
    }
}
