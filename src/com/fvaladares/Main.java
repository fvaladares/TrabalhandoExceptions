package com.fvaladares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner;
        scanner = new Scanner(System.in);
        int opt;
        int resultado = 0;
        do {
            System.out.println("\n\n\n");
            System.out.print("Por favor, informe o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Por favor, informe o denominador: ");
            int denominador = scanner.nextInt();

            try {
                resultado = Divisao.quociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
            } catch (ArithmeticException e) {
                System.err.println("O programa falhou, erro: " + e);
                e.printStackTrace();
            }


            System.out.println("\n\nDeseja continuar? (1 - sim, 2 - não):");
            opt = scanner.nextInt();
        } while (opt == 1);
        System.out.println("Processo finalizado com sucesso!!!");


    }
}


//    Divisao d1 = new Divisao();
//
//    Divisao d2 = new Divisao();
//
//        System.out.println( "D1: Contador Local: " + d1.getContadorLocal());
//                System.out.println( "D1: Contador Compartilhado: " + d1.getCounter());
//                System.out.println( "D2: Contador Local: " + d1.getContadorLocal());
//                System.out.println( "D2: Contador Compartilhado: " + d2.getCounter());
//
//                d1.incrementarContador();
//                d1.incrementarCounter();
//                d2.incrementarContador();
//                d2.incrementarCounter();
//
//                System.out.println("\n\n\n--------------------------------------------------\n\n");
//                System.out.println( "D1: Contador Local: " + d1.getContadorLocal()); //1
//                System.out.println( "D1: Contador Compartilhado: " + d1.getCounter()); //1
//                System.out.println( "D2: Contador Local: " + d2.getContadorLocal()); //1
//                System.out.println( "D2: Contador Compartilhado: " + d2.getCounter()); //1