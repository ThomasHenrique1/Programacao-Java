package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Produto x = new Produto();
            x.cadastraDados();
            float imposto;
            imposto = scanner.nextFloat();
            x.calculaImposto(imposto);
        }
    }
}
