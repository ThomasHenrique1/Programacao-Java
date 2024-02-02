package com.company;

import javax.swing.*;

public class Boletim {
    private double n1;
    private double n2;
    private double media;

    Boletim(){
        //construtor vazio
    }
    Boletim(double n1, double n2){
        this.n1 = n1 ;
        this.n2 = n2 ;
    }
    void imprimiBoletim(){
        JOptionPane.showMessageDialog(null, "Dados do Boletim:"
                +"\nNota 1: "+getN1()+
                "\nNota 2: "+getN2()+
                "\nMedia: "+getMedia()+
                "\nConceito: "+verifacaConceito());
    }

    double calculaMedia(){
        media =(getN1()+getN2())/2;
            return media;
    }

    String verifacaConceito(){
        String conceito = "";
        if(media >= 8 && media <= 10)
            conceito = "A";
        else if(media>= 6)
            conceito="B";
        else if(media >= 4)
            conceito="C";
        else
            conceito="D";
        return conceito;
    }


    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
