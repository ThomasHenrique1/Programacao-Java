package company;

import javax.swing.*;

public class Torneio {
    String nome;
    int idade;

    Torneio() {
    }

    Torneio(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
    }

    String verificaCategoria() {
        String categoria="";
            if(idade >=5  && idade <= 7)
             categoria="Infantil";
            else if(idade >= 8 && idade <=10)
               categoria="Juvenil";
            else if(idade >= 11 && idade <= 15)
             categoria="Adolescente";
            else if(idade >= 16 && idade <= 30)
              categoria="Adulto";
            else
                categoria="Sênior";

        return categoria;

    }

    void ImprimiDados() {

        JOptionPane.showMessageDialog(null,"Seu nome é: "+getNome()
                +"\nVocê tem: "+getIdade()+" anos"+"\nVocê pertence a categoria: "+verificaCategoria());
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
