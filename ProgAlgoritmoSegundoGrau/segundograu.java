import java.util.Scanner;

public class Algoritmo_segundo_grau {

    public static void main(String args[]) {
        // Criação do objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis para os coeficientes da equação de segundo grau (a, b, c) e as raízes (x1, x2)
        float a, b = 0, c = 0, delta, x1, x2 = 0;
        
        // Solicita ao usuário que insira o valor de a
        System.out.println("Digite o valor de a:");
        a = scanner.nextFloat();
        
        // Solicita ao usuário que insira o valor de b
        System.out.println("Digite o valor de b:");
        b = scanner.nextFloat();
        
        // Solicita ao usuário que insira o valor de c
        System.out.println("Digite o valor de c:");
        c = scanner.nextFloat();

        // Calcula o valor do delta
        delta = (float) (Math.pow(b, 2) - 4 * a * c);
        
        // Verifica se o delta é menor que zero
        if (delta < 0) {
            // Se delta for negativo, não existem raízes reais
            System.out.println("DELTA = " + delta);
            System.out.println("Não existem raízes reais");
        } else {
            // Se delta for maior ou igual a zero, existem raízes reais
            if (delta == 0) {
                // Se delta for zero, existe apenas uma raiz real
                x1 = -b / (2 * a);
                System.out.println("DELTA = " + delta);
                System.out.println("x' = " + x1 + " x'' = " + x1);
            } else {
                // Se delta for maior que zero, existem duas raízes reais
                x1 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("x' = " + x1);
                System.out.println("x'' = " + x2);
            }
        }
    }
}
