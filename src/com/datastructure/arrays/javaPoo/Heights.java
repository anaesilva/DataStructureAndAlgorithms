package com.datastructure.arrays.javaPoo;

import java.util.Locale;
import java.util.Scanner;

public class Heights {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "º" + " pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = scanner.next();

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();

            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();
        }

        double soma = 0;
        int menores = 0;

        for (double x : alturas) {
            soma+=x;
        }

        double media = soma / n;

        System.out.println();
        System.out.printf("Altura média = %.2f\n", media);

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16) {
                menores++;
            }
        }

        System.out.println("Pessoas com menos de 16 anos = " + (((double)menores / n) * 100.0) + "%");

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        scanner.close();
    }
}
