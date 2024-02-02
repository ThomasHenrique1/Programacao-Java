package company;

import javax.swing.*;

public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    Vendedor(){}
    Vendedor(float v, float s, String n, int f){
        setFalta(f);
        setNome(n);
        setVendas(v);
        setSalario(s);
    }
    void imprimirDados(){
        JOptionPane.showMessageDialog(null,
                "Seu nome é: "+getNome()+
                        "\nVocê faltou: "+getFalta()+
                        "\nVocê conseguiu vender mais de: "+getVendas()+
                        "\nSeu salario é de: "+getSalario()+
                        "\nSeu salario irá vir com um comissão de: "+calcularComissao()+
                        "\nSera descontado: "+descontoFalta()+" pelo tanto de vezes que você falto!");


    }
     public void calcularSalario(){

        salario = (getSalario()+calcularComissao()-descontoFalta());

            }

    public float calcularComissao(){

      double comissao ;
        if(getVendas() >= 1000 && getVendas() <=2000)
            comissao =  getVendas()* 0.1;
        else
            comissao = getVendas() *0.15;

     return (float)comissao;

    }
    public float descontoFalta(){
        float desconto;
        desconto=(getSalario()/30)*getFalta();
        return desconto;

    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(float s) {
        this.salario = s;
    }

    public float getSalario() {
        return salario;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float v) {
        this.vendas = v;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int f) {
        this.falta = f;
    }
}
