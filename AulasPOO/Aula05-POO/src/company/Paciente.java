package company;

import java.util.Date;
import java.util.Scanner;

public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    int mesNascimento;
    int diaNascimento;


    String profissao;
    public int dia;
    public int mes;

    Paciente(){
        //construtor vazio
    }
    Paciente(String n){
        nome = n;
    }



    public void cadastraDados(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome  do paciente: ");
            nome = scanner.nextLine();

            System.out.println("Digite o RG do paciente: ");
            rg = scanner.nextLine();

            System.out.println("Digite o endereço: ");
            endereco = scanner.nextLine();

            System.out.println("Digite o telefone: ");
            telefone = scanner.nextLine();

            System.out.println("Digite a profissão do paciente: ");
            profissao = scanner.nextLine();

            System.out.println("Digite o dia do nascimento do paciente: ");
            diaNascimento = scanner.nextInt();

            System.out.println("Digite o mês do nascimento do paciente: ");
            mesNascimento = scanner.nextInt();

            System.out.println("Digite o ano de nascimento do paciente: ");
            anoNascimento = scanner.nextInt();
        }





    }
    public void imprimiDados(){
        System.out.println("O nome do paciente é de: "+nome);
        System.out.println("O RG do paciente é: "+rg);
        System.out.println("O endereço do paciente é: "+endereco);
        System.out.println("O telefone do paciente é: "+telefone);
        System.out.println("A profissão do paciente é: "+profissao);
        System.out.println("A data de nascimento do paciente é: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
        System.out.println("O mesmo possui "+calculaIdade(diaNascimento,mesNascimento, anoNascimento)+" dias de vida!");


    }
    @SuppressWarnings("deprecation")
    public int calculaIdade(int d , int m , int a){
        Date x = new Date();

        a = x.getYear()+1900;

        int calculoTotal;
        int calculo;
        calculo = a - anoNascimento;


        calculoTotal = calculo * 365 + mesNascimento * 30 + diaNascimento;

        return calculoTotal;

    }
}
