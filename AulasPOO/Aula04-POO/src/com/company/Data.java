package com.company;

import java.util.Date;
import java.util.Scanner;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        Date x = new Date();
        dia = x.getDate();
        mes = x.getMonth()+1;
        ano = x.getYear()+1900;
    }
    Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;

    }
    void cadastra_Data(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Digite o dia:");
        dia= scanner.nextInt();
        System.out.print("Digite o mes:");
        mes = scanner.nextInt();
        System.out.print("Digite o ano completo sem abreviar!:");
        ano = scanner.nextInt();

    }
    String imprimeDados(){
        String relatorio ="";

        relatorio = relatorio + "Dia igual:"+dia;
        relatorio = relatorio + "\nMês é igual a: "+mes;
        relatorio = relatorio + "\nAno é igual a: "+ano;
        relatorio = relatorio + "\n"+dia+"/"+mes+"/"+(ano);
        relatorio += "\nDia"  +dia+  "de"  +mes_Por_Extenso()+  "de"  +ano;
        return relatorio;
    }
    String mes_Por_Extenso(){
        String mes_por_extenso="";
        switch (mes){
            case 1: mes_por_extenso="Janeiro";
                break;
            case 2: mes_por_extenso="Fevereiro";
                break;
            case 3: mes_por_extenso="Março";
                break;
            case 4: mes_por_extenso="Abril";
                break;
            case 5: mes_por_extenso="Maio";
                break;
            case 6: mes_por_extenso="Junho";
                break;
            case 7: mes_por_extenso="Julho";
                break;
            case 8: mes_por_extenso="Agosto";
                break;
            case 9: mes_por_extenso="Setembro";
                break;
            case 10: mes_por_extenso="Outubro";
                break;
            case 11: mes_por_extenso="Novembro";
                break;
            case 12: mes_por_extenso="Dezembro";
                break;
        }
        return mes_por_extenso;
    }
}
