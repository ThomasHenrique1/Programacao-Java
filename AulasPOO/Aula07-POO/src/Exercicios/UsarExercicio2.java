package Exercicios;

import javax.swing.*;
import java.util.Scanner;

public class UsarExercicio2 {
    public static void main(String[] args) {

        //Programador
        Programador pg = new Programador();
        pg.setNome(JOptionPane.showInputDialog(null,"Digite o seu nome: "));
        pg.setMatricula(JOptionPane.showInputDialog(null,"Digite a sua matricula: "));
        pg.setQtdeHoras(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite quantas horas voce Trabalhou: ")));
        pg.setValorHora(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor da sua hora: ")));
        pg.calculaSalario();


        try (//Analista
        Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite o seu Nome:");
            String nome = ler.next();

            System.out.println("Digite o sua Matricula:");
            String matricula = ler.next();

            System.out.println("Digite a quantidade de projetos realizados:");
            int cont = ler.nextInt();

            float[] valor = new float[cont];
            for (int i = 0; i < cont; i++) {
                System.out.println("Digite o valor do " + (i+1) + "º projeto");
                float x = ler.nextFloat();
                valor[i] = x;
            }

            Analista an = new Analista(nome, matricula, valor);
            float totalSalario = an.calculaSalario();
            System.out.println("-------------------------------------------------------"
                    + "\nNome: " + nome
                    + "\nMatricula: " + matricula
                    + "\nSalario Total: " + totalSalario);
        }
    }


    }

