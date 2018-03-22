package com.example.aluno.filmesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aluno.filmesapp.model.Usuario;
import com.example.aluno.filmesapp.model.dao.UsuarioDao;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText login,senha;
    ImageButton btnLogar,btnNovo;
    final int tela_cadastro = 1;
    final int TELA_PRINCIPAL = 13;
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
                String msg = "";
                Usuario user = UsuarioDao.Logar(login.getText().toString(),senha.getText().toString());
                if(user != null){
                Intent i = new Intent(getApplicationContext(),PrincipalActivity.class);

                i.putExtra("user",user);
                startActivityForResult(i,TELA_PRINCIPAL);
                }
                else{
                    msg = "Não logou";
                }
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == tela_cadastro){
            if(requestCode == 1){
                Toast.makeText(getApplicationContext(),"Salvado com sucesso",Toast.LENGTH_LONG).show();
            }
        }
    }



    private void binding() {
        login = findViewById(R.id.edtLogin);
        senha = findViewById(R.id.edtSenha);
        btnLogar = findViewById(R.id.btnLogar);
        btnNovo = findViewById(R.id.btnNovo);
    }
}
