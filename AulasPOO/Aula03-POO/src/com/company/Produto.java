package com.company;

import java.util.Scanner;

public class Produto {
    String marca;
    String fabricante;
    String cod_barras;
    float preco;

    Produto() {
        //Construtor vazio!
    }

    Produto(String m, String f, String c, float p) {
        marca = m;
        fabricante = f;
        cod_barras = c;
        preco = p;

    }

}
