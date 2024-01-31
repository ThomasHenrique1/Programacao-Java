
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thoma
 */
public class Exercicio2 {
    public static void main(String args[]) {
     try (Scanner scanner = new Scanner(System.in)) {
        double sal;
         double imp = 0;
         double diferenca;
         System.out.println("Digite seu salario: ");
         sal = scanner.nextDouble();
         
         if(sal > 4500){
             imp = 1000 * 0.08 + 1500 * 0.18;
             diferenca = sal - 4500;
             imp += diferenca * 0.28;
         }
         else if(sal > 3000){
             imp = 1000 * 0.08;
             diferenca = sal - 3000;
             imp += diferenca * 0.18;
         }
         else if(sal > 2000){
             diferenca = sal - 2000;
             imp = diferenca * 0.08;
         }
         
         System.out.println("O imposto sera de R$: " + imp );
    }
     
    }
}
