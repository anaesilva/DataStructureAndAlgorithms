package com.datastructure.arrays.javaPoo;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = scanner.nextInt();

        int[] vetA = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < n; i++) {
            vetA[i] = scanner.nextInt();
        }

        int[] vetB = new int[n];
        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < n; i++) {
            vetB[i] = scanner.nextInt();
        }

        int[] vetC = new int[n];

        for(int i = 0; i < n; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int x : vetC) {
            System.out.println(x);
        }

        scanner.close();
    }
}
