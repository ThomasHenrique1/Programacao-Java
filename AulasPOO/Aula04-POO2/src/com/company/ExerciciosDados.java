package com.company;



public class ExerciciosDados {

    public static void main(String[] args) {

    Triangulo roberwando = new Triangulo();
    Triangulo goiabinha = new Triangulo(12.3f,2.5f);

        System.out.println(roberwando.imprimeDados());
        System.out.println(goiabinha.imprimeDados());

        System.out.println("============================");

        Data hoje = new Data();
        System.out.println(hoje.imprimeDados());

        System.out.println("=============================");

        Data combinada = new Data();
        combinada.cadastra_Data();
        System.out.println(combinada.imprimeDados());

    }
}
