
import java.util.Scanner;
/**
 *
 * @author thoma
 */
public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float sal[][], soma;
        int i,j,m, indice, cont;
        System.out.print("Digite o número de funcionários:");
        m = scanner.nextInt();
        sal = new float [m][12];
        for(i=0; i < m; i++){
        for(j=0; j < 12; j++){
        System.out.print("Func. " + (i+1) + ", digite o salário do mês " + (j+1) + ": ");
        sal[i][j] = scanner.nextFloat();
        }
        }

        for(j=0; j<12; j++){
        soma = 0;
            for(i=0; i < m; i++){
            soma += sal[i][j];
            }
            System.out.print("\nA média dos salários pagos pela empresa no mês " + (j+1) + " foi de R$ " + (soma/m));
        }

        for(i=0; i < m; i++){
        soma = 0;
            for(j=0; j<12; j++){
            soma += sal[i][j];
            }
            System.out.print("\nFunc. " + (i+1) + ". A média anual de seus salários é: R$ " + (soma/12));
        }

        soma = 0;
        System.out.print("\nDigite o número do funcionário (1, 2, ...): ");
        indice = scanner.nextInt();
        indice = indice - 1;
        for(j=0; j<12; j++){
            soma += sal[indice][j];
        }
        System.out.print("\nO total que o funcionário " + (indice + 1) +" ganhou no ano é: R$"+ soma +"\n");

        cont = 0;
        for(i=0; i<m; i++){
            if(sal[i][11]>1000){
            cont++;
            }
        }
        System.out.print("\n" + cont + " funcionários ganharam mais de R$1000 em Dezembro deste ano");
    }
}
