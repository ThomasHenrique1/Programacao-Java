package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Conta cz = new Conta("1429-5",1000.50);
        Conta cz2 = new Conta("1587-5", 2050.45);

        cz.imprimiDados();
        cz.sacarValor(500.50);
        cz.imprimiDados();
        cz.sacarValor(700);
        JOptionPane.showMessageDialog(null, "Maior saldo: "+cz.maiorSaldo(cz2));

    }
}
