package com.example.aluno.filmesapp;

import com.example.aluno.filmesapp.model.GeneroFilme;
import com.example.aluno.filmesapp.util.data.Database;

import java.util.ArrayList;

/**
 * Created by aluno on 14/03/2018.
 */

public class GeneroDAO {

    public static int count() {
        return Database.listaGeneros.size();
    }

    public static ArrayList<GeneroFilme> findAll() {
        return Database.listaGeneros;
    }

    public static GeneroFilme get(int index) {
        return Database.listaGeneros.get(index);
    }

}
