package com.company;

import javax.swing.*;

public class Comissionado extends Mensalista {
    private float valorComissao;

    Comissionado(){

    }
    Comissionado(float valorComissao,float salario, int diasFaltosos, String nome,String carteiraprofissional){
        super(salario, diasFaltosos, nome, carteiraprofissional);
        this.valorComissao=valorComissao;
    }

    public float calculaSalario2(){
        float total1;
        float total2;

        total1 = getSalario()/30;
        total2 = total1*getDiasFaltosos();

        return total2;
    }
    public float calculaSalario() {
    double total1;
    total1= getSalario()+getValorComissao();

    return (float) total1;
    }

    @Override
    public void ImprimirDados() {
        super.ImprimirDados();
        JOptionPane.showMessageDialog(null,"Seu salario vira com uma comissão de: "+calculaSalario());
    }

    public float getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(float valorComissao) {
        this.valorComissao = valorComissao;
    }
}
