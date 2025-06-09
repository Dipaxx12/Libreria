package com.distribuida.entities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTestUnitaria {

    @Test
    public void testConstructorYGetters() {
        Autor autor = new Autor(1, "Gabriel", "García", "Colombia", "Calle 123", "0999999999", "gabriel@mail.com");

        assertEquals(1, autor.getIdAutor());
        assertEquals("Gabriel", autor.getNombre());
        assertEquals("García", autor.getApellido());
        assertEquals("Colombia", autor.getPais());
        assertEquals("Calle 123", autor.getDireccion());
        assertEquals("0999999999", autor.getTelefono());
        assertEquals("gabriel@mail.com", autor.getCorreo());
    }

    @Test
    public void testSetters() {
        Autor autor = new Autor();
        autor.setIdAutor(2);
        autor.setNombre("Isabel");
        autor.setApellido("Allende");
        autor.setPais("Chile");
        autor.setDireccion("Avenida Central");
        autor.setTelefono("0888888888");
        autor.setCorreo("isabel@mail.com");

        assertEquals(2, autor.getIdAutor());
        assertEquals("Isabel", autor.getNombre());
        assertEquals("Allende", autor.getApellido());
        assertEquals("Chile", autor.getPais());
        assertEquals("Avenida Central", autor.getDireccion());
        assertEquals("0888888888", autor.getTelefono());
        assertEquals("isabel@mail.com", autor.getCorreo());
    }

    @Test
    public void testToString() {
        Autor autor = new Autor(3, "Julio", "Cortázar", "Argentina", "Barrio Sur", "0777777777", "julio@mail.com");
        String toStringResult = autor.toString();

        assertTrue(toStringResult.contains("Julio"));
        assertTrue(toStringResult.contains("Cortázar"));
        assertTrue(toStringResult.contains("Argentina"));
        assertTrue(toStringResult.contains("Barrio Sur"));
        assertTrue(toStringResult.contains("0777777777"));
        assertTrue(toStringResult.contains("julio@mail.com"));
    }
}
