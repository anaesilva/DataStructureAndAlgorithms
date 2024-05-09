package com.datastructure.list.javaloiane;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exerc03 {
//Escreva um programa que receba uma lista de números e retorne uma nova lista contendo apenas os números pares.
    public List<Integer> newList(List<Integer> lista) {
        List<Integer> newList = new ArrayList<>();

        for (Integer n : lista) {
            if (n % 2 == 0) {
                newList.add(n);
            }
        }

        System.out.println("A nova lista: " + newList);
        return newList;
    }
// Escreva um programa que receba uma lista de palavras e retorne uma nova lista contendo apenas as palavras que começam com a letra 'a'.
    public List<String> newListChar(List<String> listaPalavras) {
        List<String> newList = new ArrayList<>();

        for (String n : listaPalavras) {

            if (n.toLowerCase().startsWith("a")) {
                newList.add(n);
            }
        }

        System.out.println("A nova lista de palavras: " + newList);
        return newList;
    }
// Escreva um programa que receba uma lista de números e retorne a soma dos números ímpares e o produto dos números pares.
    public Integer listNumeros(List<Integer> lista) {
        int somaImpares = 0;
        int prodPares = 1;

        for (Integer n : lista) {
            if (n % 2 == 0) {
               prodPares *= n;
            } else {
                somaImpares+=n;
            }
        }

        System.out.println("soma dos números ímpares: " + somaImpares);
        System.out.println("produto dos números pares: " + prodPares);
        return somaImpares;
    }
// Escreva um programa que receba uma lista de números e retorne uma nova lista contendo apenas os números que são múltiplos de 3 e 5.
    public List<Integer> newListNum(List<Integer> lista) {
        List<Integer> newList = new ArrayList<>();

        for (Integer n : lista) {
            if (n % 3 == 0 || n % 5 == 0) {
                newList.add(n);
            }
        }

        System.out.println("A nova lista dos números que são múltiplos de 3 e 5: " + newList);
        return newList;
    }
// Escreva um programa que receba duas listas de números e retorne uma nova lista contendo apenas os números que estão presentes em ambas as listas.
    public List<Integer> newListDuas(List<Integer> lista1, List<Integer> lista2) {
        Set<Integer> set = new HashSet<>(lista1);
        List<Integer> newList = new ArrayList<>();

        for (Integer num : lista2) {
            if (set.contains(num)) {
                newList.add(num);
            }
        }

        System.out.println("os números que estão presentes em ambas as listas: " + newList);
        return newList;
    }
// Escreva um programa que receba uma lista de strings e retorne uma nova lista contendo o número de caracteres de cada string.
public List<Integer> newListCharTam(List<String> listaPalavras) {
    List<Integer> newList = new ArrayList<>();

    for (String n : listaPalavras) {
        newList.add(n.length());
    }
    System.out.println("o número de caracteres de cada string: " + newList);
    return newList;
}
}
