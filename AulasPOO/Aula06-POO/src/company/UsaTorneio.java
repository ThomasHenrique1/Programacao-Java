package company;


import javax.swing.*;

public class UsaTorneio {
    public static void main(String[] args) {
        Torneio x = new Torneio();
        x.setNome((JOptionPane.showInputDialog(null,"Digite seu nome: ")));
        x.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade: ")));
        x.ImprimiDados();
    }
}
