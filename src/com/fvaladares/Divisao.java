package com.fvaladares;

public class Divisao {
    private static int counter = 0;
    private int contadorLocal = 0;

    public static int quociente(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static int getCounter() {
        return counter;
    }

    public void incrementarCounter() {
        this.counter++;
    }

    public void incrementarContador() {
        this.contadorLocal++;
    }

    public int getContadorLocal() {
        return contadorLocal;
    }
}
