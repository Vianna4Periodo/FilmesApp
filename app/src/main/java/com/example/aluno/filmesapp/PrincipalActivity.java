package com.example.aluno.filmesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aluno.filmesapp.model.Usuario;

public class PrincipalActivity extends AppCompatActivity {

    TextView nome;
    ListView list;
    Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        
        binding();

        usuario = (Usuario) getIntent().getExtras().get("user");

        nome.setText("Nome: "+usuario.getNome());
    }

    private void binding() {
        nome = findViewById(R.id.tvUsuario);
        list = findViewById(R.id.lstFilmes);
    }
}
