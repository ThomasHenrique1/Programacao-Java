package company;

import javax.swing.*;
/*  private float vendas;
    private float salario;
    private String nome;
    private int falta;*/
public class UsaVendedor {
    public static void main(String[] args) {


        Vendedor x = new Vendedor();
        x.setNome((JOptionPane.showInputDialog(null,"Digite seu nome: ")));
        x.setFalta(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de faltas que você possui: ")));
        x.setSalario(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a quantia do seu salario: ")));
        x.setVendas(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o total de vendas realizadas: ")));
        x.calcularSalario();
        x.imprimirDados();

        Vendedor y = new Vendedor();
        y.setSalario(1000);
        y.setVendas(2500);
        y.setFalta(2);
        y.setNome("Vanderlei");
        y.calcularSalario();
        y.imprimirDados();
    }
}
