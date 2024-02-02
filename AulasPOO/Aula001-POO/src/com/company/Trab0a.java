package com.company;

public class Trab0a {

    public static void main(String[] args) {
	Trabalhador trabA = new Trabalhador();
	trabA.mostra();

	Trabalhador trabB = new Trabalhador("Joao Silva",1500.75f);
	trabB.mostra();

	Trabalhador trabC = new Trabalhador("Ana Souza",1000f);
	trabC.mostra();

        System.out.println("\nDepois de alterar o salario da Ana: ");
        trabC.setSalario(4000);
        trabC.mostra();
    }
}

