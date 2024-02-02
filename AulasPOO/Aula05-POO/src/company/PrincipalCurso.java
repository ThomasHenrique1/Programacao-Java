package company;

import java.util.Scanner;

public class PrincipalCurso {
    public static void main(String[] args) {
        Curso x = new Curso();
        x.cadastraCurso();
        x.imprimiDados();
        x.calculaTotalMensalidade();


        String n;
        int q;
        String t;
        float m;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome do curso: ");
            n = scanner.next();

            System.out.println("Digite a turma: ");
            t = scanner.next();

            System.out.println("Digite a quantidade de alunos: ");
            q = scanner.nextInt();

            System.out.println("Digite o valor da mensalidade: ");
            m= scanner.nextFloat();
        }
        Curso xp = new Curso(n,q,t,m);
        xp.imprimiDados();

    }
}
