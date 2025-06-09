package com.distribuida.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTestUnitaria {

    private Categoria categoria;

    @BeforeEach
    public void setUp() {
        categoria = new Categoria(1, "Ficción", "Libros de narrativa imaginaria");
    }

    @Test
    public void testCategoriaConstructorAndGetters() {
        assertAll("Validar valores iniciales del constructor",
                () -> assertEquals(1, categoria.getIdCategoria()),
                () -> assertEquals("Ficción", categoria.getCategoria()),
                () -> assertEquals("Libros de narrativa imaginaria", categoria.getDescripcion())
        );
    }

    @Test
    public void testCategoriaSetters() {
        categoria.setIdCategoria(2);
        categoria.setCategoria("Historia");
        categoria.setDescripcion("Libros sobre historia universal");

        assertAll("Validar cambios con setters",
                () -> assertEquals(2, categoria.getIdCategoria()),
                () -> assertEquals("Historia", categoria.getCategoria()),
                () -> assertEquals("Libros sobre historia universal", categoria.getDescripcion())
        );
    }

    @Test
    public void testToString() {
        String toStringResult = categoria.toString();
        assertTrue(toStringResult.contains("Ficción"));
        assertTrue(toStringResult.contains("Libros de narrativa imaginaria"));
        assertTrue(toStringResult.contains("idCategoria=1"));
    }
}

