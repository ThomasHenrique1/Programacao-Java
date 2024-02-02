package com.company;

import javax.swing.*;

public class UsaMercadoria {
    public static void main(String[] args) {
        Mercadoria mc = new Mercadoria();

        Integer cont = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantas mercadorias diferentes você irá levar: "));
            for(int i=0;i<cont;i++){
                mc.setDescricao(JOptionPane.showInputDialog(null,"Digite a descrição da mercadoria: "));
                mc.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de mercadoria: ")));
                mc.setValor(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor da mercadoria: ")));
                mc.exibir();
            }





    }
}
