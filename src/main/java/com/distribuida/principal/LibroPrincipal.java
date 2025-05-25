package com.distribuida.principal;

import com.distribuida.entities.*;
import java.util.Date;

public class LibroPrincipal {
    public static void main(String[] args) {

        // Crear objetos dependientes (inyección de dependencias)
        Autor autor = new Autor(
                1,
                "Stephen",
                "King",
                "Estados Unidos",
                "Bangor, Maine",
                "0991234567",
                "stephen.king@example.com"
        );

        Categoria categoria = new Categoria(
                1,
                "Terror",
                "Libros de horror y suspenso psicológico"
        );

        // Crear el objeto Libro
        Libro libro = new Libro(
                1,
                "El Resplandor",
                "Plaza & Janés",
                450,
                "Primera",
                "Español",
                new Date(), // fecha actual como ejemplo
                "Un escritor se muda con su familia a un hotel embrujado",
                "Tapa dura",
                "978-987-1138-07-9",
                25,
                "resplandor.jpg",
                "Edición especial con prólogo",
                19.99,
                categoria,
                autor
        );

        System.out.println(libro.toString());
    }
}
