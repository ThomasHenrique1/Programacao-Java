package com.company;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner pd = new Scanner(System.in);
        Produto x , y;
        x = new Produto();

        System.out.println("Digite os dados do produto!");
        System.out.println("Digite o nome da marca:");
        x.marca = pd.next();
        System.out.println("Digite o frabricante do produto:");
        x.fabricante = pd.next();
        System.out.println("Digite o Codigo de Barras do produto:");
        x.cod_barras = pd.next();
        System.out.println("Digite o preço do produto:");
        x.preco = pd.nextFloat();

        System.out.println("Informações do Produto!");
        System.out.println("O nome da marca do produto é: "+x.marca);
        System.out.println("O frabricante desse produto é: "+x.fabricante);
        System.out.println("O Codigo de Barras desse produto: "+x.cod_barras);
        System.out.println("O preço deste produto é de: "+x.preco);

        System.out.println("===================================");

        System.out.println("Digite as informações do proximo produto!");

        System.out.println("====================================");
        System.out.println("Digite os dados do segundo produto, com a mesma ordem, \n Marca \n Fabricante \n Codigo de Barras \n Preço.");
        System.out.println("====================================");

        Scanner pd2 = new Scanner(System.in);

        y = new Produto(pd2.next(),
                pd2.next(),
                pd2.next(),
                pd2.nextFloat());


        System.out.println("=======================================");
        System.out.println("Informações do Produto!");
        System.out.println("O nome da marca do produto é: "+y.marca);
        System.out.println("O frabricante desse produto é: "+y.fabricante);
        System.out.println("O Codigo de Barras desse produto: "+y.cod_barras);
        System.out.println("O preço deste produto é de: "+y.preco);

    }
}
