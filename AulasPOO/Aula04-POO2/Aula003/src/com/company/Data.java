package com.company;


import java.util.Date;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        Date x = new Date();
        dia = x.getDay();
        mes = x.getMonth()+1;
        ano = x.getYear()+1900;

    }
    Data(int d , int m, int a){
        dia = d ;
        mes = m;
        ano = a;
    }
}
