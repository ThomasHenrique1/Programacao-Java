package com.company;

public class Triangulo {
    float base;
    float altura;
    Triangulo(){//construtor vazio
         }
        Triangulo(float b , float a){
        base = b;
        altura = b;
        }

        float calculaArea(){
        return(base * altura/2);
        }
        String imprimeDados(){
        String relatorio ="";

        relatorio = relatorio + "A base é igual a: "+base;
            relatorio = relatorio + "\nA altura é igual a: "+altura;
            relatorio = relatorio + "\nA area é igual a: "+calculaArea();
            return relatorio;
        }
}
