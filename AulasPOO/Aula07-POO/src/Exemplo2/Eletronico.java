package Exemplo2;

public class Eletronico extends Produto{
    private int voltagem;

    Eletronico(){

    }

    Eletronico(int c, String d, float v, int vo){

    }
    @Override
    public void print(){

    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}
