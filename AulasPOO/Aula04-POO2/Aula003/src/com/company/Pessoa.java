package com.company;

public class Pessoa {
    String nome;
   int idade;
   double renda;

    Pessoa(){}

    Pessoa(String nome, int idade, double renda){
        this.nome = nome;//usamos o this para identificar o atributo da classe
        this.idade = idade;
        this.renda = renda;
    }
    Pessoa(String nome , int idade){
        this.nome =  nome;
        this.idade = idade;

    }
    public void relatorio(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade:"+idade);
        System.out.println("Salario: "+renda);
    }
}
