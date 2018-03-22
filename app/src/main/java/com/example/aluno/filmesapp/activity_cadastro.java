package com.example.aluno.filmesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.aluno.filmesapp.model.GeneroFilme;
import com.example.aluno.filmesapp.model.Usuario;
import com.example.aluno.filmesapp.model.dao.GeneroDAO;
import com.example.aluno.filmesapp.model.dao.UsuarioDao;
import com.example.aluno.filmesapp.util.data.DataBase;

public class activity_cadastro extends AppCompatActivity {

    private EditText login,senha,nome;
    private ImageButton btnVoltar,btnSalvar;
    private Spinner genero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        binding();
        preencherSpinnerGenero();
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario u = new Usuario(1,nome.getText().toString(),
                        senha.getText().toString(),
                        login.getText().toString(),
                        GeneroDAO.get(genero.getSelectedItemPosition()),
                        false);
                UsuarioDao.gravar(u);
                UsuarioDao.gravar(u);
                setResult(1);
                finish();


            }
        });
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(2);
                finish();
            }
        });

    }

    private void preencherSpinnerGenero(){
        String[] generos = new String[GeneroDAO.count()];
        int idx = 0;
        for(GeneroFilme g: GeneroDAO.findAll()){
            generos[idx++] = g.getDescricao();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,
                generos);
        genero.setAdapter(adapter);
    }

    private void binding() {
        login = findViewById(R.id.edtCadLogin);
        senha = findViewById(R.id.edtCadSenha);
        nome = findViewById(R.id.edtCadNome);
        btnSalvar = findViewById(R.id.imgCadSalvar);
        btnVoltar = findViewById(R.id.imgcadVoltar);
        genero = findViewById(R.id.spnCadGenero);
    }
}
