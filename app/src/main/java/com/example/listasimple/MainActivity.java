package com.example.listasimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

import com.example.listasimple.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

   Button  btnSimple;
   Button btnAvanzado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_main);
       btnSimple = findViewById(R.id.btnSimple);
       btnAvanzado = findViewById(R.id.btnAvanzado);

       /* No se apague la pantalla*/


    }
public void btnSimpleClick(View view){
        Intent intent = new Intent( this, SimpleListActivity.class);
        startActivity(intent);
}
}