package com.example.aluno.filmesapp.util.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.aluno.filmesapp.model.EStatus;
import com.example.aluno.filmesapp.model.Filme;
import com.example.aluno.filmesapp.model.GeneroFilme;
import com.example.aluno.filmesapp.model.Usuario;

import java.util.ArrayList;

/**
 * Created by aluno on 13/03/2018.
 */

public class DataBase extends SQLiteOpenHelper {

    public static final String dataBaseName = "filmes.db";
    public static final int dataBaseVersion = 1;

    public DataBase(Context context,int version) {
        super(context, dataBaseName, null, dataBaseVersion);
    }

    String sqlGenere = "CREATE TABLE genero("+
            "id integer primary key autoincrement," +
            "descricao txt notnull" +
            ");";
    String sqlFilme = "CREATE TABLE filme("+
            "id integer primary key autoincrement," +
            "titulo text notnull," +
            "descricao text not null," +
            "comentario text not null," +
            "atores text not null," +
            "anoLancamento integer not null," +
            "classificacao integer not null," +
            "dataAssistiu text not null," +
            "genero integer not null," +
            "usuario integer not null," +
            "status text not null,"+
            "status txt not null" +
            ");";

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    /*public static ArrayList<Usuario> listaUsuarios;
    public static ArrayList<GeneroFilme> listaGeneros;

    static {
        listaGeneros = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
        listaGeneros.add(new GeneroFilme(1,"Ação"));
        listaGeneros.add(new GeneroFilme(2,"Drama"));
        listaGeneros.add(new GeneroFilme(3,"Comédia"));
        listaGeneros.add(new GeneroFilme(4,"Terror"));
        listaGeneros.add(new GeneroFilme(5,"Suspense"));
        listaGeneros.add(new GeneroFilme(6,"Aventura"));
        listaGeneros.add(new GeneroFilme(7,"Ficção"));
        listaGeneros.add(new GeneroFilme(8,"Documentário"));

        Usuario usu = new Usuario(1,"Vitin","ze","ze",listaGeneros.get(4),true);
        usu.getFilmes().add(new Filme(1,2015,0,"Eu tu e eles","Trança dos Carecas","",
                "",null,listaGeneros.get(3),usu, EStatus.Trash));
        usu.getFilmes().add(new Filme(2,2018,0,"Não tem","Quina da Mesa Redonda","",
                "",null,listaGeneros.get(3),usu, EStatus.Trash));
        listaUsuarios.add(usu);

    }
    */

}
