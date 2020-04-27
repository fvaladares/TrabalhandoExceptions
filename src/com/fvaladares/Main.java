package com.fvaladares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.print("Por favor, informe o numerador: ");
        int numerador = scanner.nextInt();

        System.out.print("Por favor, informe o denominador: ");
        int denominador = scanner.nextInt();

        int resultado = Divisao.quociente(numerador, denominador);
        Math.sqrt(25);
        System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);

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