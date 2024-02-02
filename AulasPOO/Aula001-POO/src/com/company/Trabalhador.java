package com.company;

public class Trabalhador {
    private String nome;
    private float salario;

    public Trabalhador() {
        setNome(new String("Sem-nome"));
        setSalario(0);
    }

    public Trabalhador(String inNome, float inSalario) {
        setNome(inNome);
        setSalario(inSalario);
    }

    public void mostra() {
        System.out.print(getNome());
        System.out.print(", mensal: R$" + getSalario());
        System.out.print(",anual: R$ " + calculaSalarioAnual());
    }

    public float calculaSalarioAnual() {
        return (getSalario() * 13 + getSalario() / 3);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}


