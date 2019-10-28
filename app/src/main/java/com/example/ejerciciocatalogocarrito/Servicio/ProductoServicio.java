package com.example.ejerciciocatalogocarrito.Servicio;


import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejerciciocatalogocarrito.Modelo.Producto;
import com.example.ejerciciocatalogocarrito.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;

public class ProductoServicio extends AppCompatActivity {

    TextView txtNombre;
    TextView txtDescripcion;
    TextView txtPrecio;
    TextView marca;

  public ProductoServicio(){
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
    }

    public void  agregarProducto(Producto producto){



    }


    public void mostrarProducto(DataSnapshot dataSnapshot){
  }

    public void editarPoducto(){


    }

    public void eliminarProducto(){


    }
}
