package com.datastructure.list;

import java.util.Arrays;
import java.util.List;

public class MainExerc01 {
    public static void main(String[] args) {
        Exerc01 test = new Exerc01();
        test.numeros();

        Exerc01 test2 = new Exerc01();
        test2.nomes();

        Exerc01 test3 = new Exerc01();
        test3.numerosPares();

        List<Integer> lista = Arrays.asList(5000, 2, 4, 100000, 3, 20000);

        Exerc01 test4 = new Exerc01();
        test4.soma(lista);

    }
}
