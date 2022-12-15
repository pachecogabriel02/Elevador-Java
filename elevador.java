package org.example;

import java.util.Scanner;

import static java.util.Locale.US;

public class Elevador {
    static Scanner scan = new Scanner(System.in).useLocale(US);
    static int andarAtual = 0;
    static int totalAndares = 5;
    static int capacidadeTotal = 12;
    static int pessoas = 5;

    public void entrar() {
        System.out.println("Atualmente temos " + pessoas + " pessoas no elevador.");
        System.out.println("Quantas pessoas irão entrar?");
        int entrar = scan.nextInt();

        if ((pessoas + entrar) > capacidadeTotal) {
            System.out.println("Não permitido. O elevador comporta até 12 pessoas.");
            entrar();
        } else {
            pessoas += entrar;
            System.out.println("Entraram mais " + entrar + " no elevador. No total, temos " + pessoas + " pessoas no elevador.");
        }
    }

    public void sair() {
        System.out.println("Atualmente temos " + pessoas + " pessoas no elevador.");
        System.out.println("Quantas pessoas irão sair?");
        int sair = scan.nextInt();

        if (sair > pessoas || sair < 1) {
            System.out.println("Não permitido. Número de pessoas dentro do elevador é menor do que o solicitado para sair.");
            sair();
        } else {
            pessoas -= sair;
            System.out.println("Saiu " + sair + " do elevador. No total, temos " + pessoas + " pessoas no elevador.");
        }
    }

    public void subir() {
        System.out.println("Atualmente estamos no " + andarAtual + "º andar");
        System.out.println("Para qual andar deseja subir?");
        int subir = scan.nextInt();

        if (subir == andarAtual) {
            System.out.println("Não permitido, pois o elevador já está neste andar. Informe novamente o andar. ");
            subir();
        } else if (subir < andarAtual) {
            System.out.println("Andar inválido. O elevador está acima do andar informado. Para ir para o " + subir + "º andar, será necessário descer.");
            descer();
        } else if (subir < 1 || subir > totalAndares) {
            System.out.println("Andar inválido. O elevador atende do 0 até o 5º andar. Informe novamente o andar.");
            subir();
        } else {
            andarAtual = subir;
            System.out.println("Estamos agora no " + subir + "º andar.");
        }
    }

    public void subirEntrada() {
        System.out.println("O elevador atende os seguintes andares: 0, 1, 2, 4, 5.");
        System.out.println("Atualmente estamos no " + andarAtual + "º andar");
        System.out.println("Para qual andar deseja subir?");
        int subirEntrada = scan.nextInt();

        if (subirEntrada == andarAtual) {
            System.out.println("Não permitido, pois o elevador já está neste andar. ");
            subirEntrada();
        } else if (subirEntrada < andarAtual) {
            System.out.println("Andar inválido. O elevador está acima do andar informado. Para ir para o " + subirEntrada + "º andar será necessário descer.");
            descerEntrada();
        } else if (subirEntrada < 1 || subirEntrada > totalAndares) {
            System.out.println("Andar inválido.");
            subirEntrada();
        } else if (subirEntrada == 3) {
            System.out.println("Andar inválido. O elevador não atende o 3º andar.");
            subirEntrada();
        } else {
            andarAtual = subirEntrada;
            System.out.println("Estamos agora no " + subirEntrada + "º andar.");
        }
    }

    public void descerEntrada() {
        System.out.println("O elevador atende os seguintes andares: 0, 1, 2, 4, 5.");
        System.out.println("Atualmente estamos no " + andarAtual + "º andar");
        System.out.println("Para qual andar deseja descer?");
        int descerEntrada = scan.nextInt();

        if (descerEntrada == andarAtual) {
            System.out.println("Não permitido, pois o elevador já está neste andar. ");
            descerEntrada();
        } else if (descerEntrada > andarAtual || descerEntrada < 0) {
            System.out.println("Andar inválido.");
            descerEntrada();
        } else if (descerEntrada == 3) {
            System.out.println("Andar inválido. O elevador não atende o 3º andar.");
            descerEntrada();
        } else {
            andarAtual = descerEntrada;
            System.out.println("Estamos agora no " + descerEntrada + "º andar.");
        }
    }

    public void descer() {
        System.out.println("Atualmente estamos no " + andarAtual + "º andar");
        System.out.println("Para qual andar deseja descer?");
        int descer = scan.nextInt();

        if (descer == andarAtual) {
            System.out.println("Não permitido, pois o elevador já está neste andar. Informe novamente o andar: ");
            descer();
        } else if (descer > andarAtual || descer < 0) {
            System.out.println("Andar inválido. Informe novamente o andar: ");
            descer();
        } else {
            andarAtual = descer;
            System.out.println("Estamos agora no " + descer + "º andar.");
        }
    }
}