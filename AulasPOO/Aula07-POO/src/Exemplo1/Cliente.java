package Exemplo1;

public class Cliente extends Pessoa {
    private float valorDivida;

    public Cliente(){}
    Cliente(String n,String f, float v){

    }
    @Override
    public void print(){

    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public float calculaJuros(float x){

        return x;
    }
}

