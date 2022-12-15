package org.example;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        // Criando objeto
        Elevador entrada = new Elevador();
        Elevador biblioteca = new Elevador();
        Elevador atrio = new Elevador();


        // Entrada
        System.out.println("ELEVADOR ENTRADA");
        entrada.entrar();
        entrada.subirEntrada();
        entrada.sair();
        entrada.descerEntrada();
        entrada.entrar();
        entrada.subirEntrada();
        entrada.sair();
        entrada.descerEntrada();
        entrada.sair();

        // Atrio
        System.out.println("ELEVADOR ATRIO");
        atrio.entrar();
        atrio.subir();
        atrio.sair();
        atrio.descer();
        atrio.sair();
        atrio.entrar();
        atrio.subir();

        // Biblioteca
        System.out.println("ELEVADOR BIBLIOTECA");
        biblioteca.entrar();
        biblioteca.subir();
        biblioteca.sair();
        biblioteca.descer();
        biblioteca.sair();
        biblioteca.subir();
        biblioteca.sair();
    }
}