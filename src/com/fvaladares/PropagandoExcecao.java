package com.fvaladares;

import java.io.IOException;

public class PropagandoExcecao {
    public static void main(String[] args) {
        PropagandoExcecao p = new PropagandoExcecao();
        try {
            p.throw1();
        } catch (IOException e) {
            System.out.println("Houve uma falha na execução da aplicação: \nERRO CODIGO 1 \n ENTRE EM CONTATO COM O SUPORTE TÉCNICO");
//            e.printStackTrace();
        }

    }

    private void throw1() throws IOException {
        throw2();
    }

    private void throw2() throws IOException {
        throw3();
    }

    private void throw3() throws IOException {
        throw4();
    }

    private void throw4() throws IOException {
        throw new IOException();
    }
}
