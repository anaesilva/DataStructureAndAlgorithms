package com.datastructure.list;

import java.util.List;

public class MainExerc03 {
    public static void main(String[] args) {
        Exerc03 test = new Exerc03();
        List<Integer> lista = List.of(0, 1, 2, 3, 4, 5);
        test.newList(lista);

        Exerc03 test1 = new Exerc03();
        List<String> lista1 = List.of("Ana", "ads", "Amor", "paz", "saude", "felicidade", "amora");
        test1.newListChar(lista1);

        Exerc03 test2 = new Exerc03();
        List<Integer> lista2 = List.of(1, 2, 3, 4, 5);
        test2.listNumeros(lista2);

        Exerc03 test3 = new Exerc03();
        List<Integer> lista3 = List.of(1, 2, 3, 4, 5, 30, 100);
        test3.newListNum(lista3);

        Exerc03 test4 = new Exerc03();
        List<Integer> lista5 = List.of(1, 2, 3, 4, 5, 30, 100);
        List<Integer> lista4 = List.of(0, 1, 2, 3, 4, 5, 6);
        test4.newListDuas(lista4, lista5);

        Exerc03 test5 = new Exerc03();
        List<String> lista6 = List.of("Ana", "ads", "Amor", "paz", "saude", "felicidade", "amora");
        test5.newListCharTam(lista6);
    }
}
