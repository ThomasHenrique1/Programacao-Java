import javax.swing.JOptionPane;

/**
 * Este programa calcula o volume de um cilindro com base na altura e raio inseridos pelo usuário.
 * O resultado é exibido em uma janela de diálogo.
 * 
 * @author thoma
 */
public class Cilindro {
    // Início da classe Prog_Volume_Cilindro

    public static void main(String args[]) { // Início do método principal
        // Declaração das variáveis para armazenar a altura, raio e volume
        double vAltura, vRaio, vVolume;
        
        // Solicita ao usuário que insira a altura da lata
        vAltura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura da lata:"));
        
        // Solicita ao usuário que insira o raio da circunferência da lata
        vRaio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o raio da circunferência da lata:"));
        
        // Calcula o volume do cilindro usando a fórmula do volume do cilindro (π * raio^2 * altura)
        vVolume = Math.PI * Math.pow(vRaio, 2) * vAltura;
        
        // Exibe o volume da lata em uma janela de diálogo
        JOptionPane.showMessageDialog(null, "O volume da lata é: " + vVolume);
    } // Fim do método principal

} // Fim da classe Prog_Volume_Cilindro
