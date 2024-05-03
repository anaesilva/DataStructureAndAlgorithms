package com.datastructure.arrays.javaPoo;

import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        int[] vet = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º" + "numero: ");
            vet[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int x : vet) {
            if(x < 0) {
                System.out.println(x);
            }
        }

        scanner.close();
    }
}
