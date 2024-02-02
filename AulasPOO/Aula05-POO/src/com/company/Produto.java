package com.company;

import java.util.Scanner;

public class Produto {
    String marca;
    float valor;
    float x;


   public  void cadastraDados(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome do produto: ");
               marca = scanner.next();
               System.out.println("Digite o valor: ");
               valor = scanner.nextFloat();
        }

    }
    public  void imprimiDados(){
        System.out.println("A marca do produto é: "+marca);
        System.out.println("O valor do produto é: "+valor);
    }
    public float calculaImposto(float porcentagem){
       float imposto = 0;
       imposto = porcentagem * valor/100;

       return imposto;
    }
}
