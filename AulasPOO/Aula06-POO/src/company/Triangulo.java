package company;

import javax.swing.*;



public class Triangulo {
    private double base;
    private double altura;

    Triangulo(){}
    Triangulo(double base, double altura){
        setAltura(altura);
        setBase(base);
    }
    public double calculaArea(){
    return ((getBase()*getAltura())/2);
    }
    void imprimiDados(){
        JOptionPane.showMessageDialog(null,

                "O triangulo possui a base com "+getBase()+

                        "altura "+getAltura()+"\n Logo sua área é igual a "+calculaArea());
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase(){
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
