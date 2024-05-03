package com.datastructure.arrays.javaPoo;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
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

        System.out.print("Valores = ");
        for (double x : vet) {
            System.out.print(x + " ");
            soma+=x;
        }
        double media = soma / n;

        System.out.println();
        System.out.println("Soma = " + soma);
        System.out.println("Média = " + media);

        scanner.close();
    }
}
