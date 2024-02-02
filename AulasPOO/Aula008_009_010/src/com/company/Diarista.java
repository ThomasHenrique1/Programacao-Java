package com.company;

import javax.swing.*;

public class Diarista extends Funcionario implements Geral{

    private float valorDia;
    private int qtdeDias;

Diarista(){

}
Diarista(float valorDia, int qtdeDias, String nome, String carteiraprofissional){
    super(nome, carteiraprofissional);
    this.qtdeDias=qtdeDias;
    this.valorDia=valorDia;
}


    public float calculaSalario() {
    float total;
    total= getValorDia()*getQtdeDias();


        return total;

    }


    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }


    public void ImprimirDados() {
        JOptionPane.showMessageDialog(null,"Seu nome é: "+getNome()+"\n"
                +"Sua carteira profissional é de: "+getCarteiraprofissional()+"\n"
                +"Seu salário será de: "+calculaSalario());
    }
}
