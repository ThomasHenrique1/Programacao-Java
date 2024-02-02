package Exemplo2;

public class Produto {
    private int codigo;
    private String descricao;
    private float valor;

    Produto() {

    }
    Produto(int c, String d, float v){

    }
    public void print(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
