package com.example.aluno.filmesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aluno.filmesapp.model.Usuario;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView login,senha;
    ImageButton btnLogar,btnNovo;
    final int tela_cadastro = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn =  new Intent(getApplicationContext(),activity_cadastro.class);
                startActivityForResult(itn,tela_cadastro);
            }
        });

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(login.getText().toString(), senha.getText().toString());
            }
        });
    }

    private void binding() {
        login = findViewById(R.id.edtLogin);
        senha = findViewById(R.id.edtSenha);
        btnLogar = findViewById(R.id.btnLogar);
        btnNovo = findViewById(R.id.btnNovo);
    }

    private void login(String nome, String senha) {
        Usuario usuario = UsuarioDAO.login(nome, senha);

        if (usuario != null) {
            Toast.makeText(this, "Login feito com sucesso!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "O usuário '" + nome + "' não existe!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == tela_cadastro) {
            if (resultCode == 1) {
                Toast.makeText(getApplicationContext(), "Salvo com sucesso!", Toast.LENGTH_LONG).show();
            }
        }
    }
}
