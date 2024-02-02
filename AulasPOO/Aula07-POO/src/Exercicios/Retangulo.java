package Exercicios;

import javax.swing.*;

public class Retangulo extends Triangulo{

    Retangulo(){

    }

    Retangulo(float b, float a){
        super(b,a);
    }

    @Override
    public float area() {
        float area;
        area = getBase()*getAltura();
        return area;

    }
    public float perimetro(){
      float perimetro;
      perimetro = (getBase()*getAltura())*2;

    return perimetro;

    }


    public void mostra() {
        JOptionPane.showMessageDialog(null,"O valor da área é de:"+area()+"\n"
                +"O valor de perimetro é igual a: "+perimetro());

    }
}
