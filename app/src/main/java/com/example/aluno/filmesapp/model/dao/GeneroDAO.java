package com.example.aluno.filmesapp.model.dao;

import com.example.aluno.filmesapp.model.GeneroFilme;
import com.example.aluno.filmesapp.util.data.DataBase;

import java.util.List;

/**
 * Created by aluno on 14/03/2018.
 */

public class GeneroDAO {
    public static GeneroFilme get(int idx)
    {
        return DataBase.listaGeneros.get(idx);
    }
    public static int count(){
        return DataBase.listaGeneros.size();
    }
    public static List<GeneroFilme> findAll(){
        return DataBase.listaGeneros;
    }
}
