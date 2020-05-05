package com.fvaladares;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner;
        scanner = new Scanner(System.in);
        int opt;
        boolean continuarLoop = true;
        int resultado = 0;
        do {
            try {
                System.out.println("\n\n\n");
                System.out.print("Por favor, informe o numerador: ");
                int numerador = scanner.nextInt();
                System.out.print("Por favor, informe o denominador: ");
                int denominador = scanner.nextInt();
                // Pode ocorrer uma exceção (divisão por zero)
                resultado = Divisao.quociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
                continuarLoop = false;
            } catch (ArithmeticException e) {
                System.err.printf("Opa, algo estranho aconteceu: %s \n", e);
                System.out.println("\nDivisão por zero (0) não é permitida. Por favor, tente novamente.");
            } catch (InputMismatchException e) {
                System.err.printf("Opa, é constrangedro, mas, algo estranho aconteceu: %s \n", e);
                scanner.nextLine(); // esvaziar o buffer.
                System.out.println("\n\nVocê deve inserir apenas valores inteiros. \nPor favor, tente novamente.\n");
            }

//
//            System.out.println("\n\nDeseja continuar? (1 - sim, 2 - não):");
//            opt = scanner.nextInt();
        } while (continuarLoop);
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