package com.example.aluno.filmesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.example.aluno.filmesapp.model.GeneroFilme;
import com.example.aluno.filmesapp.util.data.Database;

public class activity_cadastro extends AppCompatActivity {

    private EditText login, senha, nome;
    private ImageButton btnVoltar, btnSalvar;
    private Spinner genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        binding();
    }

    private void preencheSpinnergenero(){
        String[] generos = new String[Database.listaGeneros.size()];
        int idx = 0;
        for(GeneroFilme g: Database.listaGeneros){
            generos[idx++]=g.getDescricao();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                generos);
        genero.setAdapter(adapter);
    }

    private void binding() {
        login = findViewById(R.id.edtLogin);
        senha = findViewById(R.id.edtSenha);
        nome = findViewById(R.id.edtNome);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnSalvar = findViewById(R.id.btnSalvar);
    }
}
