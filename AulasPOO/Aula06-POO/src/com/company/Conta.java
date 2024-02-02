package com.company;

import javax.swing.*;


public class Conta {
    private String numero;
     private double saldo;

    Conta(String n, double s){
        this.setSaldo(s);
        this.setNumero(n);
    }

    Conta(){
        //construtor vazio
    }
    void imprimiDados(){
        JOptionPane.showMessageDialog(null,"Dados da conta:"
                +"\nNúmero: "+getNumero()+ "\nSaldo: "+getSaldo());
    }
    void sacarValor(double valor){
        if(valor > saldo){
            JOptionPane.showMessageDialog(null,"Saldo insuficiente!");

        }else{
            saldo = saldo-valor;
            JOptionPane.showMessageDialog(null,"Saldo atualizado em:"+getSaldo());

        }

    }
    public Double maiorSaldo(Conta c){
        if(this.saldo > c.getSaldo())
            return this.saldo;
        else
    return c.getSaldo();
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        saldo =s;
    }
}
