package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    EditText nombreCaja,apellidosCaja,cedulaCaja;
    Button botonInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombreCaja=findViewById(R.id.nombreCliente);
        apellidosCaja=findViewById(R.id.apellidosCliente);
        cedulaCaja=findViewById(R.id.cedulaCliente);
        botonInicio=findViewById(R.id.botonlogin);

        botonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtén los valores ingresados en los EditText
                String nombre = nombreCaja.getText().toString();
                String apellidos = apellidosCaja.getText().toString();
                String cedula = cedulaCaja.getText().toString();

                // Crea un Intent para iniciar la otra actividad
                Intent intent = new Intent(Registro.this, Home.class);

                // Agrega los valores como extras al Intent
                intent.putExtra("nombre", nombre);
                intent.putExtra("apellidos", apellidos);
                intent.putExtra("cedula", cedula);

                // Inicia la otra actividad
                startActivity(intent);



            }
        });


    }
}