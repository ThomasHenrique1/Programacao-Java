package company;

import javax.swing.*;

public class UsaTriangulo {
    public static void main(String[] args) {
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo(2.5,3.8);
        x.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a altura do triângulo: ")));
        x.setBase(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a base do triângulo")));

        y.setAltura(22);
        y.setBase(44);
        y.imprimiDados();

        x.setAltura(33);
        x.setBase(11);
        x.imprimiDados();
    }
}
