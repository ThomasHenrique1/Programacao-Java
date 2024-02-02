package com.company;

import javax.swing.*;

public class Mensalista extends Funcionario implements Geral{
    private float salario;
    private int diasFaltosos;

    Mensalista(){

    }
    Mensalista(float salario, int diasFaltosos, String nome,String carteiraprofissional){
        super(nome, carteiraprofissional);
        this.diasFaltosos=diasFaltosos;
        this.salario=salario;
    }
    public float calculaSalario() {
        float total1;
        float total2;

        total1 = getSalario()/30;
        total2 = total1*getDiasFaltosos();

        return total2;

    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getDiasFaltosos() {
        return diasFaltosos;
    }

    public void setDiasFaltosos(int diasFaltosos) {
        this.diasFaltosos = diasFaltosos;
    }


    public void ImprimirDados() {
        JOptionPane.showMessageDialog(null,"Seu nome é: "+getNome()+"\n"
                +"Sua carteira profissional é de: "+getCarteiraprofissional()+"\n"
                +"Seu salário é: "+getSalario()+"\n"
                +"O número de dias que faltou foi: "+getDiasFaltosos()+"\n"
                +"Será descontado: "+calculaSalario()+" reais do seu salário!");
    }
}
