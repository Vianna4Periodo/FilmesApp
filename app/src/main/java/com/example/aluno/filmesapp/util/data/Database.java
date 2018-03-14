package com.example.aluno.filmesapp.util.data;

import com.example.aluno.filmesapp.model.Filme;
import com.example.aluno.filmesapp.model.GeneroFilme;
import com.example.aluno.filmesapp.model.Usuario;

import java.util.ArrayList;

/**
 * Created by aluno on 13/03/2018.
 */

public class Database {
    public static ArrayList<Usuario> listaUsuarios;
    public static ArrayList<GeneroFilme> listaGeneros;

    static {
        listaGeneros = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
        listaGeneros.add(new GeneroFilme(1, "Ação"));
        listaGeneros.add(new GeneroFilme(2, "Drama"));
        listaGeneros.add(new GeneroFilme(3, "Comédia"));
        listaGeneros.add(new GeneroFilme(4, "Terror"));
        listaGeneros.add(new GeneroFilme(5, "Suspense"));
        listaGeneros.add(new GeneroFilme(6, "Aventura"));
        listaGeneros.add(new GeneroFilme(7, "Ficção"));
        listaGeneros.add(new GeneroFilme(8, "Documentário"));

        Usuario usu = new Usuario(1, "Zezin", "ze","ze", listaGeneros.get(4), true);
        usu.getFilmes().add(new Filme(
                1,
                2015,
                0,
                "Transa dos Carecas",
                "",
                "",
                "Eu tu e eles",
                null
        ));
        usu.getFilmes().add(new Filme(
                2,
                2018,
                0,
                "Quina da mesa redonda",
                "",
                "",
                "Não tem",
                null
        ));
    }
}
