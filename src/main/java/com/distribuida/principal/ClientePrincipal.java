package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "1755564901", "Diego", "Hidalgo", "Puembo", "0979272218", "dieg0stax12@gmail.com");

        System.out.println(cliente.toString());
    }
}
