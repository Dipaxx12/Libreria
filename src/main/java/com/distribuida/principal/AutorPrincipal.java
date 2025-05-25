package com.distribuida.principal;

import com.distribuida.entities.Autor;

public class AutorPrincipal {
    public static void main(String[] args) {

        Autor autor = new Autor(
                1,
                "Gabriel",
                "Márquez",
                "Colombia",
                "Aracataca, Magdalena",
                "0999999999",
                "gabriel.garcia@example.com"
        );

        System.out.println(autor.toString());
    }
}
