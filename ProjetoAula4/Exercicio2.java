
import java.util.Scanner;

/**
 *
 * @author thoma
 */
public class Exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float sal[][], soma;
        String nome[], onome;
        int i,j,m;
        System.out.print("Digite o número de funcionários:");
        m = scanner.nextInt();
        sal = new float [800][12];
        nome = new String[800];
        for(i=0; i<m; i++){
            System.out.print("Digite o nome do funcionário " + (i+1) + ":");
            nome[i] = scanner.next();
            for(j=0; j<12; j++){
            System.out.print("Digite seu salário do mês " + (j+1) + ":");
            sal[i][j] = scanner.nextFloat();
            }
        }

        for(j=0; j<12; j++){
            soma=0;
            for(i=0; i<m; i++){
            soma += sal[i][j];
            }
            System.out.print("\nA média dos salários pagos pela empresa no mês " + (j+1) + " foi de R$ " + (soma/m));
        }

        for(i=0; i<m; i++){
            soma=0;
            for(j=0; j<12; j++){
            soma += sal[i][j];
            }
            System.out.print("\n"+ nome[i] + " a média anual de seus salários é: R$ " + (soma/12));
        }

        System.out.print("\nDigite o nome do funcionário: ");
        onome = scanner.next();
        for(i=0; i<m; i++){
            if(nome[i].charAt(0) == onome.charAt(0)){
                soma=0;
                for(j=0; j<12; j++){
                soma += sal[i][j];
                }
                System.out.print("O total que o funcionário " + onome + " ganhou no ano é: R$ " + soma);
            }else{
                System.out.print("NÃO encontramos um funcionário com esse nome !");
            }
        }
     }
}
