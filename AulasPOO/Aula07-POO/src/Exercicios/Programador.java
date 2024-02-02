package Exercicios;

import javax.swing.*;

public class Programador extends Empregado{
    private float qtdeHoras;
    private float valorHora;

    public float calculaSalario() {
        Float valores;

        valores = getValorHora()*getQtdeHoras();

        JOptionPane.showMessageDialog(null,"Seu nome é: "+getNome()+"\n"+
                "Sua matricula é: "+getMatricula()+"\n"+
                "O valor do seu salario sera de: "+valores);

        return valores;
    }
    Programador(){

    }
    Programador(String nome, String matricula,float qtdeHoras, float valorHora){
        super(nome, matricula);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public float getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(float qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
}
