package com.example.aluno.filmesapp;

import com.example.aluno.filmesapp.model.Usuario;
import com.example.aluno.filmesapp.util.data.Database;

import java.util.ArrayList;

/**
 * Created by aluno on 14/03/2018.
 */

public class UsuarioDAO {

    public static void gravar(Usuario u) {
        Database.listaUsuarios.add(u);
    }

    public static Usuario login(String nome, String senha) {
        Usuario usuario = null;

        for (Usuario u: Database.listaUsuarios) {
            if (u.getNome() == nome && u.getSenha() == senha) {
                usuario = u;
                break;
            }
        }

        return usuario;
    }

}
