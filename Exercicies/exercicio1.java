import java.util.Scanner;

public class exercicio1 {
    public static void main(String args[]) {
        // Declaração das variáveis
        int qtdValores, i; // qtdValores: quantidade de valores a serem inseridos; i: contador do loop
        float valor, media, acum; // valor: valor inserido pelo usuário; media: média dos valores inseridos; acum: soma acumulada dos valores
        
        acum = 0; // Inicializa a soma acumulada como 0
        
        try (// Criação do objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira a quantidade de valores que deseja processar
            System.out.println("Quantos valores deseja processar?");
            qtdValores = scanner.nextInt();
            
            // Loop para receber os valores e acumular a soma
            for (i = 1; i <= qtdValores; i++) {
                // Solicita ao usuário que insira um valor
                System.out.println("Digite o valor " + i + ":");
                valor = scanner.nextFloat();
                
                // Acumula a soma dos valores inseridos
                acum = acum + valor;
            }
        }
        
        // Calcula a média dos valores inseridos
        media = acum / qtdValores;
        
        // Exibe a média ao usuário
        System.out.println("A média dos valores processados é de " + media);
    }
}
