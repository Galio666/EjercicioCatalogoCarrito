package com.example.ejerciciocatalogocarrito.Servicio;


<<<<<<< HEAD
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
=======
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProductoServicio {
>>>>>>> c0c81184108437d0d508df64c956b129ce81a6ff

  public ProductoServicio(){
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
    }

<<<<<<< HEAD
    public void  agregarProducto(Producto producto){



    }


    public void mostrarProducto(DataSnapshot dataSnapshot){
  }
=======
    public void  agregarProducto(){

    }

    public void mostrarProducto(){

    }
>>>>>>> c0c81184108437d0d508df64c956b129ce81a6ff

    public void editarPoducto(){


    }

    public void eliminarProducto(){


    }
}
