import java.util.Scanner;

public class Algoritmo_soma_10 {
    public static void main(String args[]) {
        // Criação do objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis para armazenar os números e a soma
        float n1, n2, soma;
        
        // Solicita ao usuário que insira o primeiro número
        System.out.println("Digite um número:");
        n1 = scanner.nextFloat();
        
        // Solicita ao usuário que insira o segundo número
        System.out.println("Digite outro número:");
        n2 = scanner.nextFloat();
        
        // Calcula a soma dos números
        soma = n1 + n2;
        
        // Verifica se a soma é maior que 10
        if (soma > 10) {
            // Se a soma for maior que 10, exibe a soma
            System.out.println("A soma é " + soma);
        }
    }
}
