package ProjetoAula10;
import javax.swing.*;

public class TrabalhadoresEmpresa {
    //Armazenaremos os dados dos trabalhadores da empresa em um vetor:
    private Trabalhador trab[];
    private int N;
    
public static void main(String[] args) {
}

public TrabalhadoresEmpresa () {
    simulacaoLeituraDeDados() ;
    mostraTrabalhadoresCadastrados();
    mostraTrabalhadoresEmOrdemAlfabetica();
    mostraSalariosDosTrabalhadores();
}

public void simulacaoLeituraDeDados() {
    //para efetuar testes rápidos, criamos um vetor de objetos com dados fixos:
    N = 7;
    trab = new Trabalhador[N];
    trab[0] = new Trabalhador("Julio",  2000f, 'M');
    trab[1] = new Trabalhador("Mariana",  1000, 'F');
    trab[2] = new Trabalhador("Renata",  800, 'F');
    trab[3] = new Trabalhador("Pedro",  1500f, 'M');
    trab[4] = new Trabalhador("Amilton",  6000f, 'M');
    trab[5] = new Trabalhador("Jorge",  2200f, 'M');
    trab[6] = new Trabalhador("Carlos",  3500f, 'M');
}

public void leituraDeDados() {
        String umNome;
        float umSalario;
        char umSexo;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de trabalhadores:"));
        trab = new Trabalhador[N];   //aloca memória para o vetor

        for (int i = 0; i < N; i++) {
            umNome = JOptionPane.showInputDialog("Digite o nome do trabalhador " + (i + 1) + ": ");
            umSalario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário de " + umNome + ": "));
            umSexo = JOptionPane.showInputDialog("Digite o sexo deste trabalhador: ").charAt(0);
            umSexo = Character.toUpperCase(umSexo);
            trab[i] = new Trabalhador(umNome, umSalario, umSexo); //aloca memória para o objeto (e executa o método construtor com parâmetros)
            // a inicialização anterior do objeto poderia ser em etapas:
            //	trab[i] = new Trabalhador();  //usando o construtor sem parâmetros
            //	trab[i].setNome(umNome);
            //	trab[i].setSalario(umSalario);
            //	trab[i].setSexo(umSexo);
        }
}

public void mostraTrabalhadoresCadastrados () {
    String cad = "";
    for (int i=0; i<N; i++) {
      cad +=  trab[i].toString()+ "\n";
    }    
    JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
    outputArea.setText(cad);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Dados dos Trabalhadores Cadastrados",
	                    JOptionPane.INFORMATION_MESSAGE);
}

//  Os métodos 'quickSort' e 'separar' a seguir ordenam um vetor de elementos de tipo double.
//  Crie  métodos para ordenar o vetor de objetos Trabalhador trab[]:
//  1) em ordem decrescente pelos salários, 2) em ordem crescente considerando o atributo nome. 

 public boolean quickSort (double[] vetor, int inicio, int fim) {

        if (vetor == null) return false;   
        if (inicio < fim) {
           int posicaoPivo = separar (vetor, inicio, fim);
           quickSort(vetor, inicio, posicaoPivo - 1);
           quickSort(vetor, posicaoPivo + 1, fim);
        }        
        return true;
    }

 private int separar (double[] vetor, int inicio, int fim) {
      double pivo = vetor[inicio];
      int i = inicio + 1, f = fim;
      while (i <= f) {
         if (vetor[i] <= pivo) i++;
         else if (pivo < vetor[f]) f--;
         else {
             double troca = vetor[i];
             vetor[i] = vetor[f];
             vetor[f] = troca;
             i++;
             f--;
         }
      }
      vetor[inicio] = vetor[f];
      vetor[f] = pivo;
      return f;
   }
 public void mostraTrabalhadoresEmOrdemAlfabetica(){
        quickSortNome(trab, 0, trab.length -1);
            String cad = "";
    for (int i=0; i<N; i++) {
      cad +=  trab[i].toString()+ "\n";
    }    
    JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
    outputArea.setText(cad);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Trabalhadores em Ordem Alfabetica",
	                    JOptionPane.INFORMATION_MESSAGE);
    }

    private boolean quickSortNome(Trabalhador trab[], int inicio, int fim) {
        if (trab == null) {
            return false;
        }
        if (inicio < fim) {
            int posicaoPivo = separarNome(trab, inicio, fim);
            quickSortNome(trab, inicio, posicaoPivo - 1);
            quickSortNome(trab, posicaoPivo + 1, fim);
        }
        return true;
    }

    private int separarNome(Trabalhador trab[], int inicio, int fim) {
        Trabalhador pivo = trab[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (trab[i].getNome().compareToIgnoreCase(pivo.getNome()) <= 0) {
                i++;
            } else if (pivo.getNome().compareToIgnoreCase(trab[f].getNome()) < 0) {
                f--;
            } else {
                Trabalhador troca = trab[i];
                trab[i] = trab[f];
                trab[f] = troca;
                i++;
                f--;
            }
        }
        trab[inicio] = trab[f];
        trab[f] = pivo;
        return f;
    }
    
    public void mostraSalariosDosTrabalhadores() {
        quickSortSalarios(trab, 0, trab.length - 1);
            String cad = "";
    for (int i=0; i<N; i++) {
      cad +=  trab[i].toString()+ "\n";
    }    
    JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
    outputArea.setText(cad);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Salarios dos Trabalhadores",
	                    JOptionPane.INFORMATION_MESSAGE);

    }

    private boolean quickSortSalarios(Trabalhador[] trab, int inicio, int fim) {
        if (trab == null) {
            return false;
        }
        if (inicio < fim) {
            int posicaoPivo = separarSalarios(trab, inicio, fim);
            quickSortSalarios(trab, inicio, posicaoPivo - 1);
            quickSortSalarios(trab, posicaoPivo + 1, fim);
        }
        return true;
    }

    private int separarSalarios(Trabalhador[] trab, int inicio, int fim) {
        Trabalhador pivo = trab[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (trab[i].getSalario() >= pivo.getSalario()) i++;
            else if (pivo.getSalario() > trab[f].getSalario())f--;
            else {
                Trabalhador troca = trab[i];
                trab[i] = trab[f];
                trab[f] = troca;
                i++;
                f--;
            }
        }
        trab[inicio] = trab[f];
        trab[f] = pivo;
        return f;
    }

}
