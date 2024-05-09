package com.datastructure.arrays.javanelioalves;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        int[] vet = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º" + "numero: ");
            vet[i] = scanner.nextInt();
        }

        System.out.print("NUMEROS PARES: ");
        int qdePares = 0;
        for (int x : vet) {
            if(x % 2 == 0) {
                System.out.print(x + " ");
                qdePares++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qdePares);


        scanner.close();
    }
}
