package com.datastructure.arrays.javanelioalves;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
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

        for (double x : vet) {
            soma+=x;
        }

        double media = soma / n;

        System.out.println("MEDIA DO VETOR = " + media);

        System.out.print("ELEMENTOS ABAIXO DA MEDIA: " );
        for (double x : vet) {
            if (x < media) {
                System.out.print(x + " ");
            }
        }

        scanner.close();
    }
}
