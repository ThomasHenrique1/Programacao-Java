package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Diarista
        Diarista dt = new Diarista();
        dt.setNome(JOptionPane.showInputDialog(null,"Digite seu nome: "));
        dt.setCarteiraprofissional(JOptionPane.showInputDialog(null,"Digite sua carteira de profissão: "));
        dt.setValorDia(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite quanto vale o seu dia de trabalho: ")));
        dt.setQtdeDias(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos dias você trabalha: ")));
        dt.ImprimirDados();

        //Mensalista
        Mensalista ml = new Mensalista();
        ml.setNome(JOptionPane.showInputDialog(null,"Digite seu nome: "));
        ml.setCarteiraprofissional(JOptionPane.showInputDialog(null,"Digite sua carteira de profissão? "));
        ml.setSalario(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do seu salário: ")));
        ml.setDiasFaltosos(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos dias você faltou: ")));
        ml.ImprimirDados();

        //Comissionado
        Comissionado cmo = new Comissionado();
        cmo.setNome(JOptionPane.showInputDialog(null,"Digite seu nome: "));
        cmo.setCarteiraprofissional(JOptionPane.showInputDialog(null,"Digite sua carteira de profissão? "));
        cmo.setSalario(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do seu salário: ")));
        cmo.setValorComissao(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor da sua comissão em Reais R$: ")));
        cmo.ImprimirDados();


    }
}
