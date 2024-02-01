/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;


public class Pessoa2 {
    private String nome_Candidato;
    private String sexo;
    private String idade_Candidato;

    Pessoa2(){

    }

    Pessoa2(String nome_Candidato,String sexo,String idade_Candidato){
        this.nome_Candidato=nome_Candidato;
        this.sexo = sexo;
        this.idade_Candidato= idade_Candidato;
    }
    public String toString(){
        return "\nCandidato= " + nome_Candidato + ", sexo= " + sexo + ", idade= " + idade_Candidato  + " anos";

    }

    public String getNome_Candidato() {
        return nome_Candidato;
    }

    public void setNome_Candidato(String nome_Candidato) {
        this.nome_Candidato = nome_Candidato;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade_Candidato() {
        return idade_Candidato;
    }

    public void setIdade_Candidato(String idade_Candidato) {
        this.idade_Candidato = idade_Candidato;
    }
}
