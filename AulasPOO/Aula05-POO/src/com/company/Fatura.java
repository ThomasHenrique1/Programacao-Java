package com.company;

public class Fatura {
    float valor;
    int pontuacao;

    public Fatura somaCom(int pont){
        Fatura x = new Fatura();
        x.pontuacao = pont;
        return x;
    }
    public Fatura somaCom(int pont, float val){
        Fatura x = new Fatura();
        x.valor = val;
        x.pontuacao = pont;
        return x;
    }
    public Fatura somaCom(Fatura fat){
        fat.pontuacao=100;
        fat.valor=1000;
        return fat;
    }
}
