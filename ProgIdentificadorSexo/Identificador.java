import javax.swing.JOptionPane;

public class Identificador {
    public static void main(String args[]) {
        // Declaração da variável para armazenar o sexo
        char sexo;
        
        // Solicita ao usuário que insira seu sexo e converte para maiúsculo para evitar distinção entre maiúsculas e minúsculas
        sexo = JOptionPane.showInputDialog(null, "Digite seu sexo:").toUpperCase().charAt(0);
        
        // Utilização do switch-case para verificar o sexo e exibir uma mensagem correspondente
        switch (sexo) {
            case 'M':
                // Se o sexo for 'M', exibe mensagem indicando sexo masculino
                JOptionPane.showMessageDialog(null, "Sexo Masculino");
                break;
            case 'F':
                // Se o sexo for 'F', exibe mensagem indicando sexo feminino
                JOptionPane.showMessageDialog(null, "Sexo Feminino");
                break;
            default:
                // Se o sexo não for 'M' nem 'F', exibe mensagem indicando sexo indefinido
                JOptionPane.showMessageDialog(null, "Sexo Indefinido");
                break;
        }
    }
}
