/*
 * Este programa calcula o Índice de Massa Corporal (IMC) com base no peso e estatura inseridos pelo usuário.
 */

/**
 * A classe IMC calcula o Índice de Massa Corporal (IMC) com base no peso e estatura inseridos pelo usuário.
 * O resultado é exibido em uma janela de diálogo.
 * 
 * @author thoma
 */
import javax.swing.*;

public class IMC {
    static float peso, estatura, imc;

    public static void main(String args[]) {
        // Solicita ao usuário que insira o peso em quilogramas (Kg)
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o peso (em Kg):"));
        
        // Solicita ao usuário que insira a estatura em metros (m)
        estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a estatura (em m):"));
        
        // Calcula o IMC usando a fórmula IMC = peso / (estatura * estatura)
        imc = peso / (estatura * estatura);
        
        // Exibe o IMC calculado em uma janela de diálogo
        JOptionPane.showMessageDialog(null, "O IMC é: " + imc + " Kg/m²");
    }
}
