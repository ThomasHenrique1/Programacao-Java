import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String args[]){
        int ContM, ContF; // Variáveis para contar o número de homens e mulheres
        float M, F, Alt, MediaM, MediaF; // Variáveis para armazenar a altura média dos homens e das mulheres
        char Sexo, Pergunta; // Variáveis para armazenar o sexo do usuário e a resposta para continuar
        M = 0; F = 0; // Inicializa as alturas acumuladas para homens e mulheres como 0
        ContM = 0; ContF = 0; // Inicializa os contadores de homens e mulheres como 0
        MediaM = 0; MediaF = 0; // Inicializa as médias de altura para homens e mulheres como 0
        // Loop para permitir que o usuário insira dados até que ele decida parar
        do {
            // Solicita ao usuário que insira seu sexo usando a caixa de diálogo JOptionPane
            Sexo = (JOptionPane.showInputDialog(null, "Escreva o seu sexo (Masculino/Feminino)")).toUpperCase().charAt(0);
            // Solicita ao usuário que insira sua altura usando a caixa de diálogo JOptionPane
            Alt = Float.parseFloat(JOptionPane.showInputDialog(null, "Escreva a sua Estatura (Metro)"));
            // Verifica o sexo do usuário e acumula a altura em M ou F, e incrementa o contador correspondente
            if(Sexo == 'M'){
                ContM += 1;
                M += Alt;
            } else {
                ContF += 1;
                F += Alt;
            }
            // Pergunta ao usuário se deseja continuar inserindo dados
            Pergunta = (JOptionPane.showInputDialog(null, "Você deseja Continuar? (Sim/Não)")).toUpperCase().charAt(0);
        } while(Pergunta == 'S');
        // Calcula a média de altura para homens e mulheres
        MediaF = F / ContF;
        MediaM = M / ContM;
        // Verifica se há dados para homens e mulheres, e exibe a altura média correspondente
        if ((M > 0) && (F > 0)) {
            JOptionPane.showMessageDialog(null, "A estatura média das mulheres é de " + MediaF + "M");
            JOptionPane.showMessageDialog(null, "A estatura média dos homens é de " + MediaM + "M");
        } else {
            if (M > 0) {
                JOptionPane.showMessageDialog(null, "A estatura média dos homens é de " + MediaM + "M");
            } else {
                JOptionPane.showMessageDialog(null, "A estatura média das mulheres é de " + MediaF + "M");
            }
        }
    }
}
