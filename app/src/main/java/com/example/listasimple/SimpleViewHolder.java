package com.example.listasimple;

import android.view.View;
import android.widget.TextView;
import androidx.wear.widget.WearableRecyclerView;
import java.util.ArrayList;
import org.w3c.dom.Text;
import android.util.Log;

import com.example.listasimple.R;
public class SimpleViewHolder extends WearableRecyclerView.ViewHolder
    implements View.OnClickListener{

    private String elemento;
    private TextView item;
    private ArrayList<String> elementos;

    private static final String TAG = Adaptador.class.getSimpleName();

    public SimpleViewHolder(final View view, ArrayList<String> e){
        super(view);
        item = (TextView) view.findViewById(R.id.simple_text);
        elementos = e;
        view.setOnClickListener(this);
    }



    public void setDato(String e){
        item.setText(e);
    }


    @Override
    public void onClick(View view) {

        int position = getAdapterPosition();
        elemento = elementos.get(position);
        Log.d(TAG, "onClick, elemento: " + elemento + "posicion: " + position);

    }



}


