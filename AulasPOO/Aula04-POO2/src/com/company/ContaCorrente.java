package com.company;

import java.util.Scanner;

public class ContaCorrente {

    String nome;
    float saldo;
    float limite;
    char tipo;

    ContaCorrente(){
        //conjunto vazio
    }
     ContaCorrente(String n, float s, float l, char t){
        nome = n;
        saldo = s;
        limite = l;
        tipo = t;
     }
     ContaCorrente(String n, float s, char t){
        nome = n;
        saldo = s;
        tipo = t;

     }
     String imprimeDados(){
        String relatorio="";
        relatorio = relatorio + "Cliente:" + nome;
         relatorio = relatorio + "\nSaldo:" +saldo;
         relatorio = relatorio + "\nLimite:" + limite;
         relatorio = relatorio + "\nTipo:" +tipo;
        return relatorio;
     }
      void sacar(float x){
        saldo =saldo-x;
     }
     void depositar(float x){
        saldo  = saldo + x;
     }
     void cadastra_Dados(){
         Scanner scanner= new Scanner(System.in);
         System.out.print("Digite o nome:");
         nome = scanner.next();
         System.out.print("Digite o saldo:");
         saldo = scanner.nextFloat();
         System.out.print("Digite o limite:");
         limite = scanner.nextFloat();
         System.out.println("Digite o tipo de conta");
         tipo = (scanner.next()).charAt(0);


     }
}
