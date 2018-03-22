package com.example.aluno.filmesapp.model.dao;

import com.example.aluno.filmesapp.model.Usuario;
import com.example.aluno.filmesapp.util.data.DataBase;

/**
 * Created by aluno on 14/03/2018.
 */

public class UsuarioDao {

    public static void gravar(Usuario u) {
        DataBase.listaUsuarios.add(u);
    }

    public static Usuario Logar(String login,String senha){
        for (Usuario u: DataBase.listaUsuarios){
            if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
                return u;
            }
        }
        return null;
    }
}
