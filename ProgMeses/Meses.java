import java.util.Scanner;

public class Meses {
    public static void main(String args[]) {
        try (// Criação do objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in)) {
            // Declaração da variável para armazenar o número do mês
            int goiaba;
            
            // Solicita ao usuário que insira o número do mês
            System.out.println("Digite o número do mês:");
            goiaba = scanner.nextInt();
            
            // Utilização do switch-case para verificar o número do mês e exibir o nome correspondente
            switch (goiaba) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
                default:
                    // Caso o número do mês não seja válido, exibe uma mensagem informando que não tem o mês correspondente
                    System.out.println("Não temos o mês correspondente");
            }
        }
    }
}
