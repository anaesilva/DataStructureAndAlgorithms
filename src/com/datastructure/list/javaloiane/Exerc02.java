package com.datastructure.list.javaloiane;

import java.util.List;

public class Exerc02 {
//Escreva um programa que imprima os números de 1 a 10 usando um loop for.
    public void scanner() {

        System.out.println("números de 1 a 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

//Escreva um programa que calcule a soma dos números de 1 a 100 usando um loop for.
    public int soma() {
        int soma = 0;

    System.out.println("soma dos números de 1 a 100: ");
    for (int i = 1; i <= 100; i++) {
        soma+=i;
    }

        System.out.println(soma);
    return soma;
    }
//Escreva um programa que imprima os elementos de uma lista usando um loop for.
    public void scannerList(List<Integer> lista) {

        System.out.println("elementos de uma lista: ");
      for (Integer x: lista) {
          System.out.println(x);
      }

    }

// Escreva um programa que receba uma string e imprima cada caractere em uma linha separada usando um loop for
    public void scannerListChar(String palavra) {

        System.out.println("cada caractere da string: ");
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
    }
}
