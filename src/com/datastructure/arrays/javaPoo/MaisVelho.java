package com.datastructure.arrays.javaPoo;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {

        int maisVelha = 0;
        String nomeMaisVelha = "";

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "º" + " pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = scanner.next();

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();


            if (idades[i] > maisVelha) {
                maisVelha = idades[i];
                nomeMaisVelha = nomes[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelha );

        scanner.close();
    }
}
