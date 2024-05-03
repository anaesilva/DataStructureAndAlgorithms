package com.datastructure.arrays.javaPoo;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        double[] vet = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º" + "numero: ");
            vet[i] = scanner.nextDouble();
        }

        double soma = 0;
        int qdePares = 0;

        for (double x : vet) {
            if(x % 2 == 0) {
                soma+=x;
                qdePares++;
            }
        }

        double media = soma / qdePares;

        if (qdePares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.println("MEDIA DOS PARES = " + media);
        }

        scanner.close();
    }
}
