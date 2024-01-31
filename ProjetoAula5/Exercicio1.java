
import java.text.DecimalFormat;
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
public class Exercicio1 {

    /**
     *
     * @param args
     * @throws IOExceotion
     */
    public static void main(String args[]) throws IOExceotion {
        try (Scanner scanner = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("0.0000");
            int raio;
            double pi, v;
            pi = 3.141592;
            System.out.println("Digite o valor de raio: ");
            raio = scanner.nextInt();

            v = (4 / 3.0) * pi * Math.pow(raio, 3);
            System.out.println("O volume da esfera é de: " + df.format(v));
        }
    }
}
