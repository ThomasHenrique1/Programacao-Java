import javax.swing.*;

public class Idade_Maior {
    public static void main(String args[]) {
        // Declaração da variável para armazenar a idade
        int idade;
        
        // Solicita ao usuário que insira a sua idade
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade"));
        
        // Chama o método Menor_Maior_Idade passando a idade como argumento
        Menor_Maior_Idade(idade);
    }

    // Método para verificar se a idade é maior ou igual a 18 e exibir a mensagem correspondente
    public static int Menor_Maior_Idade(int idade) {
        if (idade >= 18) {
            // Se a idade for maior ou igual a 18, exibe mensagem de maior de idade
            JOptionPane.showMessageDialog(null, "Você é de maior");
            JOptionPane.showMessageDialog(null, "Você tem acesso aos demais canais de televisão!");
        } else {
            // Se a idade for menor que 18, exibe mensagem de menor de idade
            JOptionPane.showMessageDialog(null, "Você é menor de idade");
            JOptionPane.showMessageDialog(null, "Você tem acesso apenas ao DiscoveryKids");
        }
        
        // Retorna 0 (não é comum retornar um valor inteiro em métodos desse tipo)
        return 0;
    }
}
