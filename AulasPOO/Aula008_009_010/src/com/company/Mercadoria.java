package com.company;

import javax.swing.*;

public class Mercadoria {
    private String descricao;
    private float valor;
    private int quantidade;

    Mercadoria(){

    }
    Mercadoria(String descricao, float valor, int quantidade){
        this.descricao=descricao;
        this.valor=valor;
        this.quantidade = quantidade;
    }
    float calculaTotalMercadoria(){
        float total;
        total = getValor()*getQuantidade();
        return total;
    }
    public void exibir(){
        JOptionPane.showMessageDialog(null,"A quantidade digitada foi de: "+getQuantidade()+
                "\n"+"O valor digitado foi de: "+getValor()
                +"\n"+"A descrição da mercadoria: "+getDescricao()+
                "\n"+"O valor total será de: "+calculaTotalMercadoria());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
