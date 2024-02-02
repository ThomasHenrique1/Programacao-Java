package PCT_POO;

import java.util.Scanner;

public class Executar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa goiabinha =  new Pessoa();
        Pessoa x = new Pessoa();

        x.nome  = "Jolonga";
        x.renda = 19000.00f;
        x.idade = 44;

        goiabinha.idade = 50;
        goiabinha.nome = "Thomas";
        goiabinha.renda = 14000.00f;

        System.out.println("O nome dele é:"+goiabinha.nome);
        System.out.println("A idade dele é:"+goiabinha.idade);
        System.out.println("A renda dele é:"+goiabinha.renda);

        System.out.println("O nome dele é:"+x.nome);
        System.out.println("A idade dele é:"+x.idade);
        System.out.println("A renda dele é:"+x.renda);



    Carro gt = new Carro();
        System.out.println("Digite a marcado do carro:");
        gt.marca = scanner.next();
        System.out.println("Digite o ano do carro:");
        gt.ano = scanner.nextInt();
        System.out.println("Digite a cor do carro:");
        gt.cor = scanner.next();
        System.out.println("Digite a quantidade de cavalos do carro:");
        gt.cavalos = scanner.nextInt();
        System.out.println("Digite o tipo de combustivel do carro:");
        gt.combustivel = scanner.next();
        System.out.println("Digite o tipo do carro:");
        gt.tipo = scanner.next();
        System.out.println("Digite o modelo do carro:");
        gt.modelo = scanner.next();



     Caixa_de_Dialogo caixa = new Caixa_de_Dialogo();
        System.out.println("Digite o tipo de botão da caixa:");
     caixa.botão = scanner.next();
        System.out.println("Digite a cor da caixa:");
     caixa.cor = scanner.next();
        System.out.println("Digite o comprimento da caixa:");
     caixa.comprimento = scanner.nextFloat();
        System.out.println("Digie a fonte da caixa:");
     caixa.fonte = scanner.next();
        System.out.println("Digite a largura da caixa:");
     caixa.largura = scanner.nextFloat();
        System.out.println("Digite o Titulo da caixa:");
     caixa.titulo = scanner.next();


     Eletrodomestico eletro = new Eletrodomestico();
        System.out.println("Digite a cor do eletrodoméstico:");
     eletro.cor = scanner.next();
        System.out.println("Digite a marca do eletrodoméstico");
     eletro.marca = scanner.next();
        System.out.println("Digite o nome de frabrica do eletrodoméstico:");
     eletro.fabricante = scanner.next();
        System.out.println("Digite o preço do eletrodoméstico:");
     eletro.preço = scanner.nextFloat();
        System.out.println("Digite o tamanho do eletrodoméstico:");
     eletro.tamanho = scanner.nextInt();
        System.out.println("Digite a voltagem do eletrodoméstico:");
     eletro.voltagem = scanner.nextFloat();

    }
}
