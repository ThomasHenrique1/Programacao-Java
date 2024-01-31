import java.util.Scanner;

public class exemplo6 {
    public static void main(String args[]) {
        // Declaração de variáveis
        float n1, n2, n3, n4; // Variáveis para armazenar as notas dos alunos
        int i, quant = 0; // Variável para controle do loop e para contar quantos alunos têm média >= 7
        float x[] = new float[10]; // Vetor para armazenar as médias dos alunos
        try (Scanner scanner = new Scanner(System.in)) {
            // Loop para inserir as notas de cada aluno e calcular a média
            for (i = 0; i < x.length; i++) {
                System.out.println((i + 1) + "º aluno:");
                System.out.println("Digite a 1º nota:");
                n1 = scanner.nextFloat();
                System.out.println("Digite a 2º nota:");
                n2 = scanner.nextFloat();
                System.out.println("Digite a 3º nota:");
                n3 = scanner.nextFloat();
                System.out.println("Digite a 4º nota:");
                n4 = scanner.nextFloat();

                // Calcula a média das notas e armazena no vetor x
                x[i] = (n1 + n2 + n3 + n4) / 4;

                // Verifica se a média do aluno atual é maior ou igual a 7
                if (x[i] >= 7) {
                    quant += 1; // Incrementa o contador de alunos com média >= 7
                }
            }
        }

        // Exibe a quantidade de alunos com média >= 7
        System.out.println(quant + " alunos com média maior ou igual a 7");

        // Exibe as médias de todos os alunos
        System.out.println("Médias dos alunos:");
        for (i = 0; i < x.length; i++) {
            System.out.print(x[i] + ", ");
        }
    }
}
