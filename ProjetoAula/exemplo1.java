import java.util.Scanner;

public class exemplo1 {
    public static void main(String args[]) {
        // Declaração de Variáveis
        int i, quant; // Variáveis de controle do loop e para armazenar a quantidade de elementos
        int Acum = 0; // Variável para armazenar a soma dos números pares
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita a quantidade de elementos a serem utilizados no vetor
            System.out.println("Digite a quantidade de elementos a serem utilizados no vetor:");
            quant = scanner.nextInt();

            // Declaração do vetor para armazenar os elementos fornecidos pelo usuário
            int x[] = new int[quant];

            // Loop para inserir os elementos no vetor
            for (i = 0; i < x.length; i++) {
                System.out.println("Digite o " + (i + 1) + "º número:");
                x[i] = scanner.nextInt(); // Armazena o elemento no vetor

                // Verifica se o elemento é par e o acumula, se for
                if (x[i] % 2 == 0) {
                    Acum += x[i]; // Soma o elemento ao acumulador
                }
            }

            // Saída de Resultados
            // Exibe a soma dos números pares
            System.out.println("O somatório dos números pares é: " + Acum);

            // Imprime os elementos do vetor
            System.out.println("Elementos do vetor:");
            for (i = 0; i < x.length; i++) {
                System.out.print(x[i] + ",\t");
            }
        }
    }
}
