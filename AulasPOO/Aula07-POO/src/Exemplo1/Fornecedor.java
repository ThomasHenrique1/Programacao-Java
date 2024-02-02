package Exemplo1;

public class Fornecedor extends Pessoa{
    private float valorCompra;
    Fornecedor(){}

    Fornecedor(String n, String f, float vc){

    }
    @Override
    public void print(){

    }
    public void calculaImposto(float imposto){

    }
    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
}
