package com.company;

public abstract class Funcionario {
    private String nome;
    private String carteiraprofissional;
    public abstract float calculaSalario();

    Funcionario(){

    }
    Funcionario(String nome, String carteiraprofissional){
        this.carteiraprofissional = carteiraprofissional;
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarteiraprofissional() {
        return carteiraprofissional;
    }

    public void setCarteiraprofissional(String carteiraprofissional) {
        this.carteiraprofissional = carteiraprofissional;
    }
}
