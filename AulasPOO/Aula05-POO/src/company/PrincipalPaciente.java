package company;

import java.util.Scanner;

public class PrincipalPaciente {
    public static void main(String[] args) {
        Paciente xp = new Paciente();
        xp.cadastraDados();
        xp.imprimiDados();
        xp.calculaIdade(xp.dia, xp.mes, xp.anoNascimento);

        System.out.println("================================");
        String n;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome  do paciente: ");
            n= scanner.nextLine();

            System.out.println("Digite o RG do paciente: ");
            System.out.println("Digite o endereço: ");
            System.out.println("Digite o telefone: ");
            System.out.println("Digite a profissão do paciente: ");
            System.out.println("Digite o dia do nascimento do paciente: ");
            System.out.println("Digite o mês do nascimento do paciente: ");
            System.out.println("Digite o ano de nascimento do paciente: ");
        }


        Paciente xx = new Paciente(n);
        xx.imprimiDados();


    }
}
