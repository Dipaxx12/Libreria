package com.distribuida.principal;

import com.distribuida.entities.*;

import java.util.Date;

public class FacturaDetallePrincipal {
    public static void main(String[] args) {

        // Cliente ya proporcionado
        Cliente cliente = new Cliente(
                1,
                "1755564901",
                "Diego",
                "Hidalgo",
                "Puembo",
                "0979272218",
                "dieg0stax12@gmail.com"
        );

        // Factura con los mismos datos de tu FacturaPrincipal
        Factura factura = new Factura();
        factura.setIdFactura(1);
        factura.setNumFactura("FAC-001");
        factura.setFecha(new Date());
        factura.setTotalNeto(100.00);
        factura.setIva(15.00);
        factura.setTotal(115.00);
        factura.setCliente(cliente);

        // Autor ficticio
        Autor autor = new Autor(
                1,
                "Stephen",
                "King",
                "Estados Unidos",
                "Bangor, Maine",
                "0991234567",
                "stephen.king@example.com"
        );

        // Categoría ficticia
        Categoria categoria = new Categoria(
                1,
                "Terror",
                "Libros de horror y suspenso psicológico"
        );

        // Libro ficticio relacionado a la factura
        Libro libro = new Libro(
                1,
                "El Resplandor",
                "Plaza & Janés",
                450,
                "Primera",
                "Español",
                new Date(),
                "Un escritor se muda con su familia a un hotel embrujado",
                "Tapa dura",
                "978-987-1138-07-9",
                10,
                "resplandor.jpg",
                "Edición especial con prólogo",
                50.00,
                categoria,
                autor
        );

        // FacturaDetalle con cantidad = 2 y subTotal calculado
        FacturaDetalle fd = new FacturaDetalle(
                1,
                2,
                100.00,  // 2 libros * 50.00
                factura,
                libro
        );

        // Mostrar salida
        System.out.println(fd);
    }
}
