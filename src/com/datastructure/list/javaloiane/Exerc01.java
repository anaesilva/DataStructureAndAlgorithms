package com.datastructure.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Escreva um programa que crie uma lista com os números de 1 a 10 e imprima a lista.
// Escreva um programa que peça ao usuário para digitar 5 nomes e armazene esses nomes em uma lista.
// Em seguida, imprima a lista.
// Escreva um programa que crie uma lista de números pares de 1 a 20 e imprima a lista.
// Escreva um programa que some todos os números em uma lista e imprima o resultado.
// Escreva um programa que encontre o maior número em uma lista e o imprima.
// Escreva um programa que verifique se um elemento específico está presente em uma lista.
public class Exerc01 {

    public void numeros() {
        List<Integer> ls = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            ls.add(i);
        }

        System.out.println("Números: "  + ls);
    }

    public void nomes() {
        Scanner sc = new Scanner(System.in);

        List<String> ls = new ArrayList<>();

        System.out.println("Digite os nomes: ");
        for(int i = 0; i < 5; i++) {
            String entrada = sc.next();

            ls.add(entrada);
        }

        System.out.println("Nomes: "  + ls);

        System.out.println("Verifique se o nome está na lista: ");
        String entrada = sc.next();
        for(String x : ls) {
            if (entrada.equals(x)) {
                System.out.println("O nome está na lista!");
                break;
            } else {
                System.out.println("O nome NÃO está na lista!");
                break;
            }
        }
        sc.close();
    }

    public void numerosPares() {
        List<Integer> ls = new ArrayList<>();

        int soma = 0;
        System.out.print("Lista de 01 a 20: ");
        for(int i = 1; i <= 20; i++) {
           ls.add(i);
           soma+=i;
        }
        System.out.println(ls);
        System.out.print("A soma desses números é: ");
        System.out.println(soma);

        List<Integer> lsPares = new ArrayList<>();

        System.out.print("Dessa lista os números pares são: ");
        for(Integer x : ls) {
            if (x % 2 == 0) {
                lsPares.add(x);
            }
        }
        System.out.println(lsPares);
    }

    public int soma(List<Integer> lista) {
        int maior = lista.getFirst();

        for(int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > maior) {
                maior = lista.get(i);
            }
        }
        System.out.print("O maior número da lista é: " + maior);
       return maior;
    }

}
