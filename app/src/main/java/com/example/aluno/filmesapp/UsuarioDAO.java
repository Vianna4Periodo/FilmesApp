package com.example.aluno.filmesapp;

import com.example.aluno.filmesapp.model.Usuario;
import com.example.aluno.filmesapp.util.data.Database;

/**
 * Created by aluno on 14/03/2018.
 */

public class UsuarioDAO {

    public static void gravar(Usuario u) {
        Database.listaUsuarios.add(u);
    }

}
