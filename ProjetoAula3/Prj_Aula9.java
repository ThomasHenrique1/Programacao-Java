import java.util.Scanner;

public class Prj_Aula9 {

    public static void main(String[] args) {
        // Declaração de variáveis
        float salario[], media, soma, menor;
        String nome[], sexo[];
        int i = 0, n, qtMulheres, ps, qtHomens;

        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitação do número de funcionários
            System.out.print("Digite a quantidade de funcionários: ");
            n = scanner.nextInt();

            // Inicialização dos arrays com tamanho definido
            salario = new float[500];
            nome = new String[500];
            sexo = new String[500];

            // Loop para preenchimento dos dados de cada funcionário
            for (i = 0; i < n; i++) {
                System.out.print("Digite o nome do funcionário: ");
                nome[i] = scanner.next();
                System.out.print("Digite o sexo do funcionário: ");
                sexo[i] = scanner.next();
                System.out.print("Digite o salário do funcionário: ");
                salario[i] = scanner.nextFloat();
            }

            // Cálculo da média salarial das mulheres
            qtMulheres = 0;
            soma = 0;
            for (i = 0; i < n; i++) {
                if (sexo[i].toUpperCase().charAt(0) == 'F') {
                    soma += salario[i];
                    qtMulheres++;
                }
            }
            media = soma / qtMulheres;
            System.out.println("Média salarial das mulheres: " + media);

            // Encontrar o funcionário com o menor salário
            ps = -1;
            menor = 9999;

            for (i = 0; i < n; i++) {
                if (salario[i] < menor) {
                    menor = salario[i];
                    ps = i;
                }
            }

            System.out.println("Menor salário é R$ " + salario[ps] + " do funcionário: " + nome[ps] + " do sexo " + sexo[ps]);

            // Contagem de homens com salário acima de R$1.000,00
            qtHomens = 0;
            for (i = 0; i < n; i++) {
                if (salario[i] > 1000 && sexo[i].toUpperCase().charAt(0) == 'M') {
                    qtHomens++;
                }
            }
            System.out.println("Qtde de homens que ganham mais de R$1.000,00: " + qtHomens);
        }
    }
}
