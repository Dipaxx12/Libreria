package com.distribuida.principal;

import com.distribuida.entities.Categoria;

public class CategoriaPrincipal {

    public static void main(String[] args) {

        Categoria autor = new Categoria(
                1,
                "Terror",
                "Dos chicas encerradas con un fantasma"
        );

        System.out.println(autor.toString());
    }
}
