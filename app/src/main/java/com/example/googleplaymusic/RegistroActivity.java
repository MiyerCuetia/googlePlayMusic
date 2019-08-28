package com.example.googleplaymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.googleplaymusic.models.Artista;

public class RegistroActivity extends AppCompatActivity {

    EditText etIdentificacion;
    EditText etNombre;
    EditText etApellido;
    EditText etCorreo;
    EditText etTelefono;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        ShowToolbar("PlayMusic", false);

        inicializer();

    }
    public void onEntrar(View view){
        Artista artista = new Artista(Integer.parseInt(etIdentificacion.getText().toString()),
                etNombre.getText().toString(),
                etApellido.getText().toString(),
                etCorreo.getText().toString(),
                Integer.parseInt(etTelefono.getText().toString()));

        Toast.makeText(this, "Bienvenido "+ etNombre.getText().toString(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ListaActivity.class);
        startActivity(intent);

    }

    public void inicializer() {
        etIdentificacion = findViewById(R.id.et_identificacion);
        etNombre = findViewById(R.id.et_nombre);
        etApellido = findViewById(R.id.et_apellido);
        etCorreo = findViewById(R.id.et_correo);
        etTelefono = findViewById(R.id.et_telefono);
        btnEntrar = findViewById(R.id.btn_entrar);

    }

    public void ShowToolbar(String title, Boolean upButton) {

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
