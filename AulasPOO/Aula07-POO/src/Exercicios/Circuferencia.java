package Exercicios;

import javax.swing.*;

public class Circuferencia extends Forma {
    private float raio;

public Circuferencia(){

}
    Circuferencia(float raio){
        this.raio=raio;
    }



    public float area(){
       Double area;
        area = Math.PI*(getRaio()*getRaio());
        return area.floatValue();

    }

    public float perimetro(){
    Double perimetro;
    perimetro = 2*Math.PI*raio;
        return perimetro.floatValue();

    }



    public void mostra(){
    JOptionPane.showMessageDialog(null,"O valor da área da circuferencia é de: "+area()+"\n"
            +"O valor do perimetro da circuferencia e de: "+perimetro());



    }
    public float getRaio() {

        return raio;

    }



    /**

     * @param raio the raio to set

     */

    public void setRaio(float raio) {

        this.raio = raio;

    }




}
