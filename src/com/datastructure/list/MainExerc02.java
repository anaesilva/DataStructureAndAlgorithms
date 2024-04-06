package com.datastructure.list;

import java.util.Arrays;
import java.util.List;

public class MainExerc02 {
    public static void main(String[] args) {
       Exerc02 test = new Exerc02();
       test.scanner();

        Exerc02 test1 = new Exerc02();
        test1.soma();

        Exerc02 test2 = new Exerc02();
        List<Integer> lista = List.of(5000, 2, 4, 100000, 3, 20000);
        test2.scannerList(lista);

        Exerc02 test3 = new Exerc02();
        test3.scannerListChar("ana");

    }
}
