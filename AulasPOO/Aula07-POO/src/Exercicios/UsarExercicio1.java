package Exercicios;

import javax.swing.*;


public class UsarExercicio1 {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        Circuferencia Cf = new Circuferencia();
        Retangulo Rt = new Retangulo();

        Cf.setRaio(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o Raio da circuferencia: ")));
        Cf.mostra();

        Rt.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a altura do retangulo: ")));
        Rt.setBase(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a base do retangulo: ")));
        Rt.mostra();


        //Complemento
        t.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a altura do triangulo: ")));
        t.setBase(Float.parseFloat((JOptionPane.showInputDialog(null,"Digite a base do triangulo: "))));
        t.mostra();
    }
}
