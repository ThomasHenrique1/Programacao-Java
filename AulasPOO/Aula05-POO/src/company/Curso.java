package company;

import java.util.Scanner;

public class Curso {
    String nome;
    int quantidadedealunos;
    String turma;
    float mensalidade;

    Curso(){
        //construtor vazio
    }
    Curso(String n,int q,String t,float m){
        nome = n;
        quantidadedealunos = q;
        turma = t;
        mensalidade = m;
    }
    public void cadastraCurso(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome do curso: ");
            nome = scanner.nextLine();

            System.out.println("Digite a turma: ");
            turma = scanner.nextLine();

            System.out.println("Digite a quantidade de alunos: ");
            quantidadedealunos = scanner.nextInt();

            System.out.println("Digite o valor da mensalidade: ");
            mensalidade = scanner.nextFloat();
        }


    }
    public void imprimiDados(){
        System.out.println("O nome do curso é: "+nome);
        System.out.println("A turma é: "+turma);
        System.out.println("A quantidade de alunos é de: "+quantidadedealunos);
        System.out.println("O valor da mensalidade do curso é: "+mensalidade);
        System.out.println("O valor anual deste curso é de R$:"+calculaTotalMensalidade());
    }
    public float calculaTotalMensalidade(){
    float valorAnual = 0;
    valorAnual = mensalidade*12;
        return valorAnual;
    }
}
